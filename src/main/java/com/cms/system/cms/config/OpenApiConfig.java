package com.cms.system.cms.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Value("${server.port:8080}")
    private String serverPort;

    @Value("${server.servlet.context-path:}")
    private String contextPath;

    @Bean
    public OpenAPI customOpenAPI() {
        final String securitySchemeName = "bearerAuth";

        // Production server
        String productionUrl = "https://cms-f4l0.onrender.com";

        // Local development server
        String localUrl = "http://localhost:" + serverPort + (contextPath != null ? contextPath : "");

        return new OpenAPI()
                .addSecurityItem(new SecurityRequirement().addList(securitySchemeName))
                .addServersItem(new Server().url(productionUrl).description("Production Server (Render)"))
                .addServersItem(new Server().url(localUrl).description("Local Development Server"))
                .components(
                        new Components()
                                .addSecuritySchemes(securitySchemeName,
                                        new SecurityScheme()
                                                .name(securitySchemeName)
                                                .type(SecurityScheme.Type.HTTP)
                                                .scheme("bearer")
                                                .bearerFormat("JWT")))
                .info(apiInfo());
    }

    private Info apiInfo() {
        return new Info()
                .title("CMS API Documentation")
                .description("This API exposes endpoints to manage the CMS application.")
                .version("1.0")
                .contact(new Contact()
                        .name("CMS Support")
                        .email("support@cms.com")
                        .url("https://www.cms.com/contact"))
                .license(new License()
                        .name("MIT License")
                        .url("https://choosealicense.com/licenses/mit/"));
    }
}
