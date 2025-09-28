package com.cms.system.cms.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.NonNull;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

/**
 * A filter that processes JWT authentication tokens in the request header.
 * Validates the JWT token and sets the authentication in the security context.
 */
public class JwtAuthenticationFilter extends OncePerRequestFilter {
    private static final Logger logger = LoggerFactory.getLogger(JwtAuthenticationFilter.class);
    private static final String AUTH_HEADER = "Authorization";
    private static final String BEARER_PREFIX = "Bearer ";

    private final JwtUtil jwtUtil;
    private final UserDetailsService userDetailsService;

    /**
     * Creates a new instance of the JwtAuthenticationFilter.
     *
     * @param jwtUtil            The JWT utility class
     * @param userDetailsService The user details service
     */
    public JwtAuthenticationFilter(JwtUtil jwtUtil,
            UserDetailsService userDetailsService) {
        this.jwtUtil = jwtUtil;
        this.userDetailsService = userDetailsService;
    }

    @Override
    protected void doFilterInternal(
            @NonNull HttpServletRequest request,
            @NonNull HttpServletResponse response,
            @NonNull FilterChain filterChain) throws ServletException, IOException {
        try {
            String jwt = parseJwt(request);
            if (jwt != null) {
                String username = jwtUtil.getUsernameFromToken(jwt);

                if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
                    // Load user details and create authentication object
                    UserDetails userDetails = userDetailsService.loadUserByUsername(username);

                    // Validate token and create authentication
                    if (jwtUtil.validateToken(jwt, userDetails)) {
                        UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
                                userDetails,
                                null,
                                userDetails.getAuthorities());

                        authentication.setDetails(
                                new WebAuthenticationDetailsSource().buildDetails(request));

                        // Set the authentication in the SecurityContext
                        SecurityContextHolder.getContext().setAuthentication(authentication);
                    }
                }
            }
        } catch (Exception e) {
            logger.error("Cannot set user authentication: {}", e.getMessage());
            // Set error in request attribute to be handled by the authentication entry
            // point
            request.setAttribute("exception", e);
        }

        filterChain.doFilter(request, response);
    }

    /**
     * Extracts the JWT token from the Authorization header.
     *
     * @param request The HTTP request
     * @return The JWT token or null if not found or invalid
     */
    private String parseJwt(HttpServletRequest request) {
        try {
            String headerAuth = request.getHeader(AUTH_HEADER);
            if (StringUtils.hasText(headerAuth) && headerAuth.startsWith(BEARER_PREFIX)) {
                return headerAuth.substring(BEARER_PREFIX.length()).trim();
            }
        } catch (Exception e) {
            logger.error("Error extracting JWT token: {}", e.getMessage());
        }
        return null;
    }
}
