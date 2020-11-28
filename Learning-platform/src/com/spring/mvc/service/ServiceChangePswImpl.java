package com.spring.mvc.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mvc.Dao.ChgPswDao;
import com.spring.mvc.entity.ChangePassword;

@Service
public class ServiceChangePswImpl implements ServiceChangePsw {

	@Autowired
	ChgPswDao chgPswDao;
	
	@Override
	@Transactional
	public void updatePassword(ChangePassword changePassword) {

		chgPswDao.updatePassword(changePassword);
	}

}
