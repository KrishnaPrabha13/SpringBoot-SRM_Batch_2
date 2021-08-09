package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;


@SpringBootApplication
public class Qus3Application {

	public static void main(String[] args) {
		SpringApplication.run(Qus3Application.class, args);
		ApplicationContext applicationContext = SpringApplication.run(Qus3Application.class, args);

		for (String name : applicationContext.getBeanDefinitionNames()) 
		{
			System.out.println(name);
	}
}
	
	@Profile("Ram")
	@Bean
	public String ramBean() {
		return "Ram";
	}

	@Profile("user")
	@Bean
	public String userBean() {
		return "user";
	}
}

