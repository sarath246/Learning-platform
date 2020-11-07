package com.spring.mvc.Dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.mvc.entity.EditProfile;
import com.spring.mvc.entity.Register;

@Repository
public class EditProfileDaoImpl implements EditProfileDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public int update(Register register) {

		Session session = sessionFactory.getCurrentSession();
		
		try {
			
			   int id = 1;
			
			   EditProfile editProfile = session.get(EditProfile.class, id);
			   
			   System.out.println("Updating user objects...");
			   
			   session.saveOrUpdate(editProfile);
			   
			   System.out.println("Success...");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return 0;
	}

}
