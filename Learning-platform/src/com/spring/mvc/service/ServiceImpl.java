package com.spring.mvc.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.mvc.Dao.ChgPswDao;
import com.spring.mvc.Dao.LoginDao;
import com.spring.mvc.Dao.RegisterDao;
import com.spring.mvc.entity.ChangePassword;
import com.spring.mvc.entity.Register;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

	@Autowired
	private RegisterDao registerDao;
	
	@Autowired
	private ChgPswDao chgPswDao;
	
	@Autowired
	private LoginDao loginDao;
	
	@Override
	@Transactional			// registration
	public void saveRegister(Register register) {

		registerDao.saveRegister(register);
		
	}

	@Override
	@Transactional			// change password
	public void updatePassword(ChangePassword changePassword) {

		chgPswDao.updatePassword(changePassword);
		
	}

	@Override
	@Transactional
	public boolean checkLogin(String email, String psw) {

		System.out.println("Service : check login...");
		
		return loginDao.checkLogin(email, psw);
	}

	@Override
	@Transactional
	public boolean getEmail(String email) {

		System.out.println("\nService : get email...");
		
		return registerDao.getEmail(email);
	}
	
}
