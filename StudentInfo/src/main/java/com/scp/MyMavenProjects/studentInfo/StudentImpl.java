package com.scp.MyMavenProjects.studentInfo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.scp.MyMavenProjects.studentInfo.App.SearchParam;

public class StudentImpl implements StudentOp {

	public StudentBean getStudent(int studId) throws MyException {

		Session session = HibernateUtil.getSessionFactory().openSession();
		StudentBean s = session.get(StudentBean.class, studId);
		session.close();
		return s;
	}

	public boolean addStudent(StudentBean stud) throws MyException {

		checkForStudentDataValidity(stud);
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.save(stud);
		} catch (Exception e) {
			transaction.rollback();
			throw new MyException("Error while adding");
		} finally {
			HibernateUtil.closeConnection(session, transaction);
		}
		return true;
	}

	public boolean deleteStudent(int studId) throws MyException {

		if (studId <= 0)
			throw new MyException("Student id should be greater than 0");
		StudentBean s = new StudentBean();
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		try {
			s = session.get(StudentBean.class, studId);
			if (null == s)
				throw new MyException("No such data present to delete");
			session.delete(s);
		} catch (Exception e) {
			transaction.rollback();
			throw new MyException("Error while deleting");
		} finally {
			HibernateUtil.closeConnection(session, transaction);
		}
		return true;
	}

	public StudentBean updateStudent(StudentBean stud) throws MyException {

		checkForStudentDataValidity(stud);
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.update(stud);
		stud = getStudent(stud.getStudId());
		HibernateUtil.closeConnection(session, transaction);
		return stud;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<StudentBean> getAllStudents() throws MyException {

		Session session = HibernateUtil.getSessionFactory().openSession();
		@SuppressWarnings("deprecation")
		Criteria criteria = session.createCriteria(StudentBean.class);
		ArrayList<StudentBean> studList = (ArrayList<StudentBean>) criteria.list();
		session.close();
		return studList;
	}

	@SuppressWarnings("unchecked")
	public List<StudentBean> searchStudentsWithCriteria(StudentBean stud, App.SearchParam... searchParam)
			throws MyException {
		
		checkForStudentDataValidity(stud);
		List<StudentBean> studList = new ArrayList<StudentBean>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Criteria criteria = session.createCriteria(StudentBean.class);
		for (App.SearchParam param : searchParam) {

			if (param == SearchParam.STUDENT_ID) {
				studList.add(session.get(StudentBean.class, stud.getStudId()));
				HibernateUtil.closeConnection(session, transaction);
				return studList;
			}

			if (param == SearchParam.STUDENT_NAME) {
				criteria.add(Restrictions.eq("studName", stud.getStudName()));
			}
			if (param == SearchParam.STUDENT_ADDRESS) {
				criteria.add(Restrictions.eq("address", stud.getAddress()));
			}

		}
		studList = criteria.list();
		HibernateUtil.closeConnection(session, transaction);
		return studList;
	}

	private void checkForStudentDataValidity(StudentBean stud) throws MyException {

		if (null == stud || stud.getStudId() <= 0 || null == stud.getStudName() || null == stud.getAddress()
				|| stud.getStudName().trim().length() <= 1 || stud.getAddress().trim().length() <= 1){
			throw new MyException("Incorrect student data");
		}
	}

}
