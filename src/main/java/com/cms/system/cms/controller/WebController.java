package com.cms.system.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {

    @GetMapping("/")
    public String home() {
        return "redirect:/welcome";
    }

    @GetMapping("/welcome")
    public ModelAndView welcome() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("welcome");
        return modelAndView;
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
