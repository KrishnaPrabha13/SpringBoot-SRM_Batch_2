package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class GetReq
{
	@GetMapping("/user")
	public Emp test() {
			
		Emp e=new Emp("1", "Ram", "45","Male");
		return e;
	}
}
