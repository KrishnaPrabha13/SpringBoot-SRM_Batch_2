package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
@Entity
public class Employee
{
	private int id;
			
	@NotNull(message="name cannot be null")
	@Size(min=4, max=8, message="name must be min 4 char and max 8 char")
	private String name;
			
			
	@NotNull(message="email cannot be empty")
	@Email
	private String email; 
			
			
	@Positive(message = "age cannot be negative")
	private int age;

	public int getId() {
		return id;
	}


	public void setId(int id) {
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


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + "]";
	}
	
}
