package com.spring.mvc.service;

import com.spring.mvc.entity.ChangePassword;
import com.spring.mvc.entity.Register;

public interface Service {

	// registration
	public void saveRegister(Register register);
	
	// change password
	public void updatePassword(ChangePassword changePassword);
	
	public boolean checkLogin(String email, String psw);
	
	public boolean getEmail(String email);
	
}
