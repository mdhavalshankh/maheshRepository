package com.scp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scp.model.Student;

import com.scp.dao.StudentDAO;;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentDAO;

	@Transactional
	public void addStudent(Student student) {
		studentDAO.addStudent(student);
	}

	public List<Student> getAllStudents() {
		return studentDAO.getAllStudents();
	}

	public void deleteStudent(Integer id) {
		studentDAO.deleteStudent(id);
	}

	public Student getStudent(int id) {
		return studentDAO.getStudent(id);
	}

	public Student updateStudent(Student student) {
		return studentDAO.updateStudent(student);
	}

	public StudentDAO getStudentDAO() {
		return studentDAO;
	}

	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

}
