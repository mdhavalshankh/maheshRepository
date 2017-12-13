package com.scp.MyMavenProjects.studentInfo;
import java.util.ArrayList;
import java.util.List;

import javax.management.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class StudentImpl implements StudentOp {

	public StudentBean getStudent(int studId) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		return session.get(StudentBean.class, studId);
	}

	public boolean addStudent(StudentBean stud) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(stud);
		transaction.commit();
		session.close();
		return true;
	}

	public boolean deleteStudent(int studId) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(session.get(StudentBean.class, studId));
		transaction.commit();
		session.close();
		return true;
	}

	public StudentBean updateStudent(StudentBean stud) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.update(stud);
		transaction.commit();
		session.close();
		return getStudent(stud.getStudId());
	}

	@SuppressWarnings("unchecked")	
	public ArrayList<StudentBean> getAllStudents() {

		Session session = HibernateUtil.getSessionFactory().openSession();
		@SuppressWarnings("deprecation")
		Criteria criteria = session.createCriteria(StudentBean.class);
		return (ArrayList<StudentBean>) criteria.list();
	}

	
	
	@SuppressWarnings("unchecked")
	public List<StudentBean> searchStudentsWithCriteria(String s) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		@SuppressWarnings("deprecation")
		Criteria criteria = session.createCriteria(StudentBean.class);
		criteria.add(Restrictions.eq("studName", s));
		return criteria.list();
	}

}
