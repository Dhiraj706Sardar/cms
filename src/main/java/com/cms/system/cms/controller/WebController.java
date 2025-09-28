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
        return "welcome";  // serves welcome.html from templates
    }

    @GetMapping("/login")
    public String login() {
        return "login";  // serves login.html from templates
    }

    @GetMapping("/signup")
    public String signup() {
        return "signup";  // serves signup.html from templates
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
