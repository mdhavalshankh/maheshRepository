package com.scp.MyMavenProjects.studentInfo;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@javax.persistence.Entity
public class StudentBean {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int studId;
	@Column
	private String studName;
	@Column
	private String address;
	public StudentBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentBean(int studId, String studName, String address) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.address = address;
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "StudentBean [studId=" + studId + ", studName=" + studName + ", address=" + address + "]";
	}
	
	
}
