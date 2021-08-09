package com.example.demo.Controller;


import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Entity.*;
import com.example.demo.Interface.*;
import com.example.demo.Advice.ResourceException;




@RestController
@CrossOrigin("*")
public class EmployeeController
{
	@Autowired
	private Emp empImpl;
		
		
	@PostMapping(value = "saveEmp")
	public ResponseEntity<String> addNewEmp(@Valid @RequestBody Employee employee) {
		empImpl.saveEmp(employee);
		return ResponseEntity.ok("Added");
	}
		
		
	@PutMapping(value = "updateEmp")
	public ResponseEntity<String> updateEmp(@RequestParam ("id") Integer id,@RequestBody Employee employee) {
		 empImpl.updateEmp(employee);
		 return ResponseEntity.ok("Updated");
	}
		
		
	@DeleteMapping(value = "deleteEmp/{id}")
	public ResponseEntity<String> deleteEmp(@RequestParam ("id") Integer id,@RequestBody Employee employee) {
		System.out.println("Delete Employee");
		  empImpl.deleteEmp(id);
		  return ResponseEntity.ok("Deleted");
	}
		
	@RequestMapping(value = "/findAllEmp", method = RequestMethod.GET)
	public ResponseEntity<Object> getEmployees()
	{
		List<Employee> employeeList = empImpl.getAllEmp();
		return new ResponseEntity<>(employeeList, HttpStatus.OK);
	}
}
