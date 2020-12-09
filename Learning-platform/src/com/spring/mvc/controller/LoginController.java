package com.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.mvc.entity.Login;
import com.spring.mvc.service.ServiceLogin;

@Controller
public class LoginController {


	@Autowired
	private ServiceLogin serviceLogin;
	
	@RequestMapping(value = "/loginShow", method = {RequestMethod.GET, RequestMethod.POST})
	public String loginPage(Model model) {
		
		model.addAttribute("login", new Login());
		
		return "login";
	}

	@PostMapping(value = "/loginAction")
	public String loginToUserHome(@Valid @ModelAttribute("login") Login login, Errors errors, Model model, HttpServletRequest request, BindingResult bindingResult,
								   @RequestParam("email") String email, @RequestParam("psw") String psw) {
	
		
		if (errors.hasErrors()) {
			
			return "login";
		}
		
		boolean userExist = serviceLogin.checkLogin(login.getEmail(), login.getPsw());
	
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
