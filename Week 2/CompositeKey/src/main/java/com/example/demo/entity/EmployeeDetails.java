package com.example.demo.entity;

import javax.persistence.EmbeddedId;

public class EmployeeDetails 
{
	@EmbeddedId
	private EmployeeIdentity id;
	
	private String name;
	private String email;
	private String phoneNumber;
	
	public EmployeeDetails() {
		
	}

	public EmployeeDetails(EmployeeIdentity id, String name, String email, String phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public EmployeeIdentity getId() {
		return id;
	}

	public void setId(EmployeeIdentity id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
	
	
	
	
	
	
	

}
