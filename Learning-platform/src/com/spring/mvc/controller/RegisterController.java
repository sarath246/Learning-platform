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
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.mvc.entity.Register;
import com.spring.mvc.service.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Controller
public class RegisterController {
	
	@Autowired
	private Service service;
	

	@GetMapping(value = "/reg")
	public String registerForm(Model model) {
		
		// create model attribute to bind data
		Register regUser = new Register();
		model.addAttribute("regUser", regUser);
	
		return "register-form";
	}
	
	@PostMapping(value = "/save")
	public String saveData(@Valid @ModelAttribute("regUser") Register register, Errors errors, @RequestParam("lname") String lname, @RequestParam("fname") String fname , @RequestParam("email") String email, @RequestParam("psw") String psw, Model model, HttpServletRequest request, BindingResult bindingResult) {
	
		int i = 0;
		
		while (i < 5) {
			
		
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		
		String hashedPassword = passwordEncoder.encode(psw);
		System.out.println("password :" + hashedPassword);
		i++;
		}
		
		boolean chechUser = service.getEmail(register.getEmail());
		
		System.out.println("Email id :" + chechUser);
	
		
		if (errors.hasErrors()) {
			
			return "register-form";
		}
		
		
		if (chechUser) {
			
			System.out.println("the user is exist...");
			
			bindingResult.rejectValue("email",  "error.idOutOfRange", "the email is already exist");
			
			return "register-form";
		}
		
		
		if (fname.matches("[0-9]+")) {
			
			bindingResult.rejectValue("fname", "error.idOutOfRange", "Characters only");
			
			return "register-form";
		}
		
		
		if (lname.matches("[0-9]+")) {
			
			bindingResult.rejectValue("lname", "error.idOutOfRange", "Characters only");
				
			return "register-form";
		}
		
		if (!email.matches(".+@.+\\..+")) {
			
			bindingResult.rejectValue("email", "error.idOutOfRange", "Wrong email!");
			
			return "register-form";
		}
	
		// save the customer using our service
		service.saveRegister(register);
		
		
		return "register-success";
		
	}
	
}
