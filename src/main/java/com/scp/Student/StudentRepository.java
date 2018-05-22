package com.scp.Student;

import java.util.ArrayList;

public class StudentRepository {

	ArrayList<Student> l = new ArrayList<>();
	
	public ArrayList<Student> getStudents(){
		l.add(new Student(1, "Mahesh", new Address(411043, "Pune")));
		l.add(new Student(2, "MD", new Address(410501, "Osmanabad")));
		
		return l;
	}
	
	public Student getStudent(int id){
		for (Student student : l) {
			if(id==student.id)
				return student;
		}
		
		return null;
	}
}
