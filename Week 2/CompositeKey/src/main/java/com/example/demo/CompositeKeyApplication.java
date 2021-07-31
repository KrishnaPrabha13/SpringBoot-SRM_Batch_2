package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.entity.EmployeeDetails;
import com.example.demo.entity.EmployeeIdentity;
import com.example.demo.repo.EmployeeRepo;

@SpringBootApplication
public class CompositeKeyApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepo empRepo;
	
	
	public static void main(String[] args) {
		SpringApplication.run(CompositeKeyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		empRepo.deleteAllInBatch();
		
		EmployeeDetails emp = new EmployeeDetails(new EmployeeIdentity("E-100", "C-1001") , "Ram","Ram@gmail.com", "989898989898");
		empRepo.save(emp);
	}
}
