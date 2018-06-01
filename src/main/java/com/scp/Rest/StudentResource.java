package com.scp.Rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("students")
public class StudentResource {

	StudentRepository repo = new StudentRepository();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getStudents(){
		System.out.println("getStudents() called!!!");
		return repo.getStudents();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("{id}")
	public Student getStudent(@PathParam("id") int id){
		
		System.out.println("getStudent() called!!!");
		return repo.getStudent(id);
	}
	
	@Path("student")
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Student saveStudent(Student s){
		System.out.println("saveStudent() called!!!");
		return repo.addStudent(s);
	}
}
