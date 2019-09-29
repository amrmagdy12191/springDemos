package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	@GetMapping("/showLoginForm")
	public String showLoginPage(){
		return "plain-login";
	}
	
	@GetMapping("/showFancyLoginForm")
	public String showFancyLoginPage(){
		return "fancy-login";
	}
	
	@GetMapping("/access-denied")
	public String showAccessDenied() {		
		return "access-denied";	
	}
}
