package com.spring.mvc.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.mvc.entity.ChangePassword;

@Repository
public class ChgPswImpl implements ChgPswDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void updatePassword(ChangePassword changePassword) {

		
		Session session = sessionFactory.getCurrentSession();
		
		session.update(changePassword);
	}

	
}
