package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface Empinter 
{
	public void saveEmp(Employee employee);
	public Employee updateEmp(Employee employee);
	public void deleteEmp(int id);
	public List<Employee> getAllEmp();


}
