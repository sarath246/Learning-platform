package com.spring.mvc.service;

public interface ServiceLogin {

	
	public boolean checkLogin(String email, String psw);
	
	public boolean getEmail(String email);
	
}
