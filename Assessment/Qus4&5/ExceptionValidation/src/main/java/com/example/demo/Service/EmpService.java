package com.example.demo.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Entity.Employee;
import com.example.demo.Interface.Emp;
import com.example.demo.Repo.EmpRepo;

@Service
public class EmpService  implements Emp
{
	@Autowired
	private EmpRepo emprepo;

	@Override
	public void saveEmp(Employee employee) {
		emprepo.save(employee);
			
	}

	@Override
	public Employee updateEmp(Employee employee) {
	
		return emprepo.save(employee);
	}

	@Override
	public void deleteEmp(int id) {
		emprepo.deleteById(id);
			
	}

	@Override
	public List<Employee> getAllEmp() {
			return (List<Employee>) emprepo.findAll();
	}
}