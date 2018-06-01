package com.scp.dao;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scp.model.EmpModel;

@Repository
public class EmpDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	Session session;
	Transaction tx;

	public List<EmpModel> getEmps() {
		List<EmpModel> l = new ArrayList<EmpModel>();
		try{
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
		l = session.createQuery("from EmpModel").list();
		}catch (Exception e) {
			System.out.println("Exception while getting Emp records.");
		}finally{
			tx.commit();
			session.close();
		}
		
		return l;
	}

	public void addEmp(EmpModel emp) {
		try{
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.save(emp);
		}catch (Exception e) {
			System.out.println("Exception while saving Emp record.");
		}finally{
			session.flush();
			tx.commit();
			session.close();
		}
		
	}

}
