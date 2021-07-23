package com.org.web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyProg {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		Student std = (Student)context.getBean("student");
		
		System.out.println("Hello" + " " +std.getName());
		System.out.println(std.getName() + " "+ "Belongs to" + " " +std.getsCourse().getCourse()+ " "+"Course");
		((AbstractApplicationContext) context).registerShutdownHook();
	
	}

}
