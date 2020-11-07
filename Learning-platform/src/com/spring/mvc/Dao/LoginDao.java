package com.spring.mvc.Dao;


public interface LoginDao {

	
	// get the id of the user
	public boolean checkLogin(String email, String psw);
	
}
