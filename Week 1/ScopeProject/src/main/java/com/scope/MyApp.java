package com.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp 
{
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		Student std = (Student)context.getBean("student");
		std.setName("RAM");
		System.out.println(std.getName());
		
		Student std2 = (Student)context.getBean("student");
		System.out.println(std2.getName());
	}

}
