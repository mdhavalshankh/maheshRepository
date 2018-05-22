package com.scp.service;
import java.util.List;

import com.scp.model.*;
/**
 * @author Mahesh
 *
 */
public interface StudentService {

	public void addStudent(Student student);
	 
    public List<Student> getAllStudents();
 
    public void deleteStudent(Integer id);
 
    public Student getStudent(int id);
 
    public Student updateStudent(Student student);
}
