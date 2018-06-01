package com.scp.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class EmpModel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int empId;
	String name;
	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn
	EmpAddress empAddr;

	public EmpModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpModel(int empId, String name, EmpAddress empAddr) {
		super();
		this.empId = empId;
		this.name = name;
		this.empAddr = empAddr;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EmpAddress getEmpAddr() {
		return empAddr;
	}

	public void setEmpAddr(EmpAddress empAddr) {
		this.empAddr = empAddr;
	}

	@Override
	public String toString() {
		return "EmpModel [empId=" + empId + ", name=" + name + ", empAddr=" + empAddr + "]";
	}

}
