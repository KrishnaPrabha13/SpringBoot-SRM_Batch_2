package com.example.demo;

public class Emp 
{
	private String id;
	private String name;
	private String age;
	private String gender;
		
	public String getId()
	{
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {		
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {			
		this.age = age;
	}
	

	public void setId(String id) {
		this.id = id;
	}
		
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {		
		this.gender = gender;
	}

	public Emp(String id, String name, String age, String gender) {		
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender=gender;
	}
	@Override
	public String toString() {		
		return "Emp [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}