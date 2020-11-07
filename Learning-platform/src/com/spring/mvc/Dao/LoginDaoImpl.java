package com.spring.mvc.Dao;


import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.mvc.entity.Login;

@Repository
@Transactional
public class LoginDaoImpl implements LoginDao {

	@Autowired
	private SessionFactory sessionFactory;


	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}



	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}



	@Override
	public boolean checkLogin(String email, String psw) {

		System.out.println("Checking login...");
		
		Session session = sessionFactory.getCurrentSession();
		
		try {
		
			boolean userFound = false;
			
			String sqlQry = "from Login as o where o.email=? and o.psw=?";
			
			Query query = session.createQuery(sqlQry);
			
			query.setParameter(0, email);
			query.setParameter(1, psw);
			
			@SuppressWarnings("unchecked")
			List<Login> list = query.getResultList();
			
			System.out.println("List :" + list);
			
			if ((list != null) && (list.size()>0)) {
				
				userFound = true;
			}

			return userFound;
			
			
		} catch (Exception e) {

			e.printStackTrace();
			return false;
		}
		
	}
	
}
