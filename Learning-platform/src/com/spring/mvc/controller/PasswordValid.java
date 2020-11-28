package com.spring.mvc.controller;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.spring.mvc.entity.Register;

public class PasswordValid implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {

		return Register.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "psw", "required.password", "Field name is required!");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmPassword", "required.confirmPassword", "Field name is required.");
		
	}

	
}
