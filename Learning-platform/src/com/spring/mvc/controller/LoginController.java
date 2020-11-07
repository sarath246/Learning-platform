package com.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.mvc.entity.Login;
import com.spring.mvc.service.Service;

@Controller
public class LoginController {

	@Autowired
	private Service service;
	
	@GetMapping(value = "/loginShow")
	public String loginPage(Model model) {
		
		model.addAttribute("login", new Login());
		
		return "login";
	}

	@PostMapping(value = "/loginAction")
	public String loginToUserHome(@Valid @ModelAttribute("login") Login login, Errors errors, Model model, HttpServletRequest request, BindingResult bindingResult) {
	
		
		if (errors.hasErrors()) {
			
			return "login";
		}
		

		boolean userExist = service.checkLogin(login.getEmail(), login.getPsw());

		if (userExist) {
			
			model.addAttribute("fname", login.getEmail());
			model.addAttribute("id", login.getId());
			return "homepage-user";
		}
		else
		{
			bindingResult.rejectValue("email", "error.idOutOfRange", "Login failed!");
			
			return "login";
		}
		
	}
	
}
