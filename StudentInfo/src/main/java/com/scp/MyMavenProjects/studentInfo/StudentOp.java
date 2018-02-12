package com.scp.MyMavenProjects.studentInfo;

import java.util.ArrayList;
import java.util.List;


public interface StudentOp {

	StudentBean getStudent(int studId) throws MyException;
	boolean addStudent(StudentBean stud) throws MyException;
	boolean deleteStudent(int studId) throws MyException;
	StudentBean updateStudent(StudentBean stud) throws MyException;
	ArrayList<StudentBean> getAllStudents() throws MyException;
	List<StudentBean> searchStudentsWithCriteria(StudentBean stud, App.SearchParam ...searhParam) throws MyException;
}
