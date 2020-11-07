package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EditProfileController {

	@RequestMapping(value = "/editPro")
	public String editProfile(Model model) {
		
		return "edit-profile";
	}
	
	
}
