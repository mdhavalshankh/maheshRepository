package com.scp.Rest;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	int pin;
	String city;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Address(int pin, String city) {
		super();
		this.pin = pin;
		this.city = city;
	}
	
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + "]";
	}
	
}
