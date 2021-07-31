package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EmpReponse;
import com.example.demo.dto.EmpRequest;
import com.example.demo.entiity.Employee;
import com.example.demo.repo.EmpDetailsRepo;
import com.example.demo.repo.EmpRepo;

@RestController
public class EmpController
{
	@Autowired
	private EmpRepo empRepo;
	
	@Autowired
	private EmpDetailsRepo empDeatils;
	
	
	@PostMapping("/emp")
	public Employee empDetail(@RequestBody EmpRequest request)
	{
		return empRepo.save(request.getEmployee());
	}

	@GetMapping("/findAll")
	public List<Employee> findAllEmp(){
		return empRepo.findAll();
	}
	
	@GetMapping("/getInfo")
	public List<EmpReponse> getJoinInformation(){
		return empRepo.getJoinInformation();
	}
}
