package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Qus3Application {

	public static void main(String[] args) {
		SpringApplication.run(Qus3Application.class, args);
		
		AnnotationConfigApplicationContext ctx = 
		         new AnnotationConfigApplicationContext(Confi.class);
		   
		      Message message = ctx.getBean(Message.class);
		      message.setMessage("hello everyone");
		      message.getMessage();
	}

}
