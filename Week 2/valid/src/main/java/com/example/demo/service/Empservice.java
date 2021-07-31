package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmpRepo;

@Service
public class Empservice implements Empinter
{
	@Autowired
	private EmpRepo employeeRepo;

	@Override
	public void saveEmp(Employee employee) {
		employeeRepo.save(employee);
		
	}

	@Override
	public Employee updateEmp(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employee);
	}

	@Override
	public void deleteEmp(int id) {
		employeeRepo.deleteById(id);
		
	}

	@Override
	public List<Employee> getAllEmp() {
		// TODO Auto-generated method stub
		return (List<Employee>) employeeRepo.findAll();
	}

}
