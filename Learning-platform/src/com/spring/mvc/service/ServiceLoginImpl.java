package com.spring.mvc.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mvc.Dao.LoginDao;
import com.spring.mvc.Dao.RegisterDao;

@Service
public class ServiceLoginImpl implements ServiceLogin {

	@Autowired
	LoginDao loginDao;
	
	@Autowired
	RegisterDao registerDao;
	
	@Override
	@Transactional
	public boolean checkLogin(String email, String psw) {

		return loginDao.checkLogin(email, psw);
	}

	@Override
	@Transactional
	public boolean getEmail(String email) {

		return registerDao.getEmail(email);
	}

}
