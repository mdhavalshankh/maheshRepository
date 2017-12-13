package com.scp.MyMavenProjects.studentInfo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;

public interface StudentOp {

	StudentBean getStudent(int studId);
	boolean addStudent(StudentBean stud);
	boolean deleteStudent(int studId);
	StudentBean updateStudent(StudentBean stud);
	ArrayList<StudentBean> getAllStudents();
	List<StudentBean> searchStudentsWithCriteria(String s);
}
