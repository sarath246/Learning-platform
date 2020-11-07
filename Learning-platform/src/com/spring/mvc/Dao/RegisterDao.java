package com.spring.mvc.Dao;

import java.util.List;

import com.spring.mvc.entity.Register;

public interface RegisterDao {

	
	public List<Register> getRegisters();
	
	public void saveRegister(Register register);
	
	public boolean getEmail(String email);
	
}
