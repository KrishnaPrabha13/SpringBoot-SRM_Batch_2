package com.example.demo.Interface;

import java.util.List;
import com.example.demo.Entity.Employee;

public interface Emp 
{
	public void saveEmp(Employee employee);
	public Employee updateEmp(Employee employee);
	public void deleteEmp(int id);
	public List<Employee> getAllEmp();


}
