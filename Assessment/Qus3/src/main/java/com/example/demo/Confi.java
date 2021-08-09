package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Confi {
	   @Bean 
	   public Message helloWorld(){
	      return new Message();
	   }
}
