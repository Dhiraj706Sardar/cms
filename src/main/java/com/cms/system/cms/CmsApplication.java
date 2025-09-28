package com.cms.system.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

@SpringBootApplication
@Controller
public class CmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmsApplication.class, args);
        System.out.println("Application Started......");
    }

    @GetMapping("/")
    public RedirectView home() {
        // Redirect to Swagger UI
        return new RedirectView("/swagger-ui.html");
    }
    
    @GetMapping("/welcome")
    public String welcome() {
        return "<html>" +
               "<head>" +
               "    <title>Welcome to College Management System</title>" +
               "    <style>" +
               "        body { font-family: Arial, sans-serif; text-align: center; margin-top: 50px; }" +
               "        .container { max-width: 800px; margin: 0 auto; }" +
               "        .btn { display: inline-block; padding: 10px 20px; margin: 10px; " +
               "               background-color: #4CAF50; color: white; text-decoration: none; " +
               "               border-radius: 5px; }" +
               "        .btn:hover { background-color: #45a049; }" +
               "    </style>" +
               "</head>" +
               "<body>" +
               "    <div class='container'>" +
               "        <h1>Welcome to College Management System</h1>" +
               "        <p>Please choose an option below to get started:</p>" +
               "        <div>" +
               "            <a href='/swagger-ui.html' class='btn'>API Documentation (Swagger UI)</a>" +
               "            <a href='/signup' class='btn'>Sign Up</a>" +
               "        </div>" +
               "    </div>" +
               "</body>" +
               "</html>";
    }
}
