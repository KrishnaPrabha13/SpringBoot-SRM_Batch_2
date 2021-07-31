package com.example.demo.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Employee;
import com.example.demo.service.Empservice;

@RestController
public class EmpController
{
	@Autowired
	private Empservice empSer;
	
	
	@PostMapping(value = "saveEmp")
	public ResponseEntity<String> addNewEmp(@Valid @RequestBody Employee employee) {
//		empSer=null;
		empSer.saveEmp(employee);
		return ResponseEntity.ok("employee added succesfully");
	}
	
	@PutMapping(value = "updateEmp")
	public ResponseEntity<String> updateEmp(@RequestBody Employee employee) {
		empSer.updateEmp(employee);
		 return ResponseEntity.ok("employee updated succesfully");
	}
	
	@DeleteMapping(value = "deleteEmp/{id}")
	public ResponseEntity<String> deleteEmp(@PathVariable Integer id,@RequestBody Employee employee) {
		System.out.println("At delete employee");
		empSer.deleteEmp(id);

		return ResponseEntity.ok("employee deleted succesfully");
	}
	
	@RequestMapping(value = "/findAllEmp", method = RequestMethod.GET)
	public ResponseEntity<Object> getEmployees()
	{
		List<Employee> employeeList = empSer.getAllEmp();
		return new ResponseEntity<>(employeeList, HttpStatus.OK);
		
	}

}
