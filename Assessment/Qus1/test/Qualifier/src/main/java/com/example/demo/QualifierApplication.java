package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class QualifierApplication {

	public static void main(String[] args) {
		SpringApplication.run(QualifierApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

	      Profile profile = (Profile) context.getBean("profile");
	      profile.printAge();
	      profile.printName();
	}

}
