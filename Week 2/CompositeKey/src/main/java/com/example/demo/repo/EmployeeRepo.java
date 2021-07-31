 package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.EmployeeIdentity;
import com.example.demo.entity.EmployeeDetails;

public interface EmployeeRepo extends JpaRepository<EmployeeDetails,EmployeeIdentity> {

}
