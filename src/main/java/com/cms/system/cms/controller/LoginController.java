package com.cms.system.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class LoginController {
	@GetMapping("/login2")
	String login() {
		return "login";
	}
}