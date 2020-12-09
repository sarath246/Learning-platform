package com.spring.mvc.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.mvc.entity.ChangePassword;

@Controller
public class ChangePswController {

	
	@GetMapping(value = "/changePassword")
	public String changePassword(Model model) {
		
		ChangePassword changePsw = new ChangePassword();
		
		model.addAttribute("changePsw",changePsw);
		
		return "changePassword";
	}
	
	@PostMapping(value = "/changed")
	public String changePsw(@Valid @ModelAttribute("changePsw") ChangePassword changePassword, Errors error, Model model) {
		
		if (error.hasErrors()) {
			
			return "changePassword";
		}
		else {
			
		return "pasword-change-success";
		}
	}
	
	
}
