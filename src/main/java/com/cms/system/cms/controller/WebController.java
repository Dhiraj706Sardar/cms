package com.cms.system.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class WebController {

    @GetMapping("/")
    public RedirectView home() {
        return new RedirectView("/welcome");
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "<!DOCTYPE html>" +
               "<html>" +
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

    @GetMapping("/login")
    public String login() {
        return "forward:/login.html";
    }

    @GetMapping("/signup")
    public String signup() {
        return "forward:/signup.html";
    }

    @GetMapping("/admin/dashboard")
    public String adminDashboard() {
        return "forward:/admin-dashboard.html";
    }

    @GetMapping("/teacher/dashboard")
    public String teacherDashboard() {
        return "forward:/teacher-dashboard.html";
    }

    @GetMapping("/student/dashboard")
    public String studentDashboard() {
        return "forward:/student-dashboard.html";
    }
}
