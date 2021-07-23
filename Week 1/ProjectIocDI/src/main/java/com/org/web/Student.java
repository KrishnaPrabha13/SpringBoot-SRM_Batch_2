package com.org.web;

public class Student
{
	public Student()
	{
//		System.out.println("Welcome To Today's Class");
	}
	
	
	private Studentcourse sCourse;

	public Studentcourse getsCourse() {
		return sCourse;
	}

	public void setsCourse(Studentcourse sCourse) {
		this.sCourse = sCourse;
	}


	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [sCourse=" + sCourse + ", name=" + name + "]";
	}

	
	public void init() {
		System.out.println("Bean is going through init");
	}
	
	public void destroy() {
		System.out.println("Bean destroyed");
	}
	
	
}
