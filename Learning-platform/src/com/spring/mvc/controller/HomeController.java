package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/")
	public String indexPage(Model model) {
		
		return "index";
	}

	@RequestMapping(value = "/home")
	public String homePage(Model model) {
		
		return "homepage-user";
	}
	
	
}
