package com.spring.mvc.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mvc.Dao.RegisterDao;
import com.spring.mvc.entity.Register;

@Service
public class ServiceRegisterImpl implements ServiceRegister {

	@Autowired
	RegisterDao registerDao;
	
	@Override
	@Transactional
	public void saveRegister(Register register) {

		registerDao.saveRegister(register);
	}

}