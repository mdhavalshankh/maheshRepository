package com.scp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmpAddress {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int addId;
	String city;

	public EmpAddress() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpAddress(int addId, String city) {
		super();
		this.addId = addId;
		this.city = city;
	}

	public int getAddId() {
		return addId;
	}

	public void setAddId(int addId) {
		this.addId = addId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "EmpAddress [addId=" + addId + ", city=" + city + "]";
	}

}
