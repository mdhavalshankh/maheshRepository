package com.scp.Rest;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class StudentRepository {

	SessionFactory factory = HibernateUtil.getSessionFactory();
	Session session;

	public List<Student> getStudents() {
		List<Student> l = new ArrayList<>();
		try {
			session = factory.getCurrentSession();
			System.out.println("session created");
			session.beginTransaction();
			System.out.println("transaction created");
			l = session.createQuery("from Student").list();
		} catch (Exception e) {
			System.out.println("Exception while getting records.");
		} finally {
			session.getTransaction().commit();
			session.close();
		}
		return l;
	}

	public Student getStudent(int id) {
		Student s = null;
		try {
			session = factory.getCurrentSession();
			session.beginTransaction();
			s = session.get(Student.class, id);
		} catch (Exception e) {
			System.out.println("Exception while getting record with id " + id);
		} finally {
			session.getTransaction().commit();
			session.close();
		}
		return s;
	}

	public Student addStudent(Student s) {
		try {
			session = factory.getCurrentSession();
			session.beginTransaction();
			session.save(s);
		} catch (Exception e) {
			System.out.println("Exception while adding record");
		} finally {
			session.getTransaction().commit();
			session.close();
		}
		return getStudent(s.id);
	}
}
