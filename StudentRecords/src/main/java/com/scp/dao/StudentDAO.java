package com.scp.dao;
import java.util.List;

import com.scp.model.Student;
public interface StudentDAO {

	public void addStudent(Student student);
	 
    public List<Student> getAllStudents();
 
    public void deleteStudent(Integer id);
 
    public Student updateStudent(Student student);
 
    public Student getStudent(int id);
}
