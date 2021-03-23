package com.zensar.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {

	@RequestMapping(value = "/default")
	public String defaultAfterLogin(HttpServletRequest request) {

		if (request.isUserInRole("ROLE_ADMIN")) {
			return "redirect:/adminDashboard";
		} else if (request.isUserInRole("ROLE_USER")) {
			return "redirect:/userDashboard";
		} else {
			return "redirect:/login";
		}
	}
}
