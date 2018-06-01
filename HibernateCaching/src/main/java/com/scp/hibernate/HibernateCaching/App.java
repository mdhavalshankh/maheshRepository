package com.scp.hibernate.HibernateCaching;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Student s1 = new Student(1, "Mahesh", new Address(100, "Osmanabad"));
		Student s2 = new Student(2, "Akshay", new Address(101, "Pune"));

		// To save records
		Session session1 = factory.openSession();
		session1.beginTransaction();

		session1.save(s1);
		session1.save(s2);

		session1.getTransaction().commit();
		session1.close();

		// First level cache example
		Session session2 = factory.openSession();
		session2.beginTransaction();

		// System.out.println(session2.get(Student.class, 1));
		// System.out.println(session2.get(Student.class, 1));

		Query query = session2.createQuery("from Student where name like 'mahesh'").setCacheable(true);
		System.out.println("Session2: " + query.getSingleResult());

		session2.getTransaction().commit();
		session2.close();

		// Second level cache
		Session session3 = factory.openSession();
		session3.beginTransaction();

		// System.out.println(session3.get(Student.class, 1));

		Query query1 = session3.createQuery("from Student where name like 'mahesh'").setCacheable(true);
		System.out.println("Session3: " + query1.getSingleResult());
		
		session3.getTransaction().commit();
		session3.close();
	}
}
