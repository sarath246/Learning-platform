package com.spring.mvc.Dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.mvc.entity.Register;



@Repository
public class RegisterDaoImpl implements RegisterDao {

	// inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
	
	// save register datas
	public void saveRegister(Register register) {

		
		// get current hibernate session
		Session session = sessionFactory.getCurrentSession();

		try {

					
			// save the customer
			session.save(register);

			
		} catch (Exception e) {
			
			System.out.println("Exceptions :" + e);
		}
	}

	@Override
	@Transactional
	public List<Register> getRegisters() {

		//Session session = sessionFactory.getCurrentSession();
		
		try {

			
			//Query<Register> regQuery = session.createQuery("from tbl_register reg where reg.username=:username and reg.password=:password", Register.class);
			
			//List<Register> registers = regQuery.getResultList();
			
			//System.out.println("Username , Password :" + registers);
			
			//return registers;

			
		} catch (Exception e) {
			
			e.printStackTrace();
			return null;
		}
		return null;
		
	}

	@Override
	@Transactional
	public boolean getEmail(String email) {

		
		Session session = sessionFactory.getCurrentSession();
		
		try {
			
			
			boolean userExists = false;
			
			String sqlQuery = "from Register as o where o.email=?";
			
			Query query = session.createQuery(sqlQuery);
			
			query.setParameter(0, email);
			
			@SuppressWarnings("unchecked")
			List<Register> list = query.getResultList();
		
			
			if ((list != null) && (list.size()>0)) {
				
				userExists = true;
			}
			
			return userExists;
			
		} catch (Exception e) {
			
			System.out.println("Exceptions :" + e);
			return false;
		}
		
	}
	
	
}
