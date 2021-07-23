package com.org.auto;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyDemo
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Employee emp = (Employee)context.getBean("employee");
		
		System.out.println("Name: "+emp.getName());
		
		System.out.println("Department: "+emp.getDept().getName());
		
		
	}

}
