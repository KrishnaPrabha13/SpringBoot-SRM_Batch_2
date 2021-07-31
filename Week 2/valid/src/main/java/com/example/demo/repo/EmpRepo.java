package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Employee;

public interface EmpRepo extends CrudRepository<Employee, Integer>{

}
