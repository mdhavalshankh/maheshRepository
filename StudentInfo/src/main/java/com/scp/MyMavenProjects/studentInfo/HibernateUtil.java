package com.scp.MyMavenProjects.studentInfo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionFactory() throws MyException {
		if (sessionFactory == null) {
			try {
				sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			} catch (Exception e) {
				throw new MyException("Check cfg file");
			}
		}
		return sessionFactory;
	}

	public static void closeConnection(Session session, org.hibernate.Transaction transaction){
		if (null != transaction)
			transaction.commit();
		if (null != session)
			session.close();
	}
}
