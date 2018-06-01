package com.scp.Rest;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory factory;

	public static SessionFactory getSessionFactory() {
		try {
			if (factory == null)
				factory = new Configuration().configure().buildSessionFactory();
		} catch (Exception e) {
			System.out.println("Error while creating SessionFactory");
			e.printStackTrace();
		}
		return factory;
	}
}
