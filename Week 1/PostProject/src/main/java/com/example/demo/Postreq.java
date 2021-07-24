package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Postreq
{
	@RequestMapping(value="/info", method=RequestMethod.POST)
	public ResponseEntity<String> Info (@RequestBody Employee employee)
	{
		return ResponseEntity.ok("Success");
	}
	

}
