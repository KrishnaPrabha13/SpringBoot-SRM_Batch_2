package com.example.demo.Repo;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.Entity.Employee;


public interface EmpRepo extends CrudRepository<Employee, Integer>{ 

}
