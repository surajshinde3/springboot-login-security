package com.zensar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	/*
	 * @GetMapping("/") public String root() { return "index"; }
	 */
	
	@GetMapping("/home")
	public String getHomePage() {
		return "home";
	}
	
	@GetMapping("/terms")
	public String getTerms() {
		return "terms";
	}

	@GetMapping("/login")
	public String login(Model model) {
		return "login";
	}

	@GetMapping("/user")
	public String userIndex() {
		return "user/index";
	}
	

	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}

	@GetMapping("/userDashboard")
	public String getUserDash() {
		return "userDashboard";
	}

	@GetMapping("/adminDashboard")
	public String getAdminDash() {
		return "adminDashboard";
	}

}
