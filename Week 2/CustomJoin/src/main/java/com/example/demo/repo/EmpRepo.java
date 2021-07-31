package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.dto.EmpReponse;
import com.example.demo.entiity.Employee;


public interface  EmpRepo extends JpaRepository<Employee,Integer> {
	@Query("SELECT new com.example.demo.dto.EmpReponse (c.name , p.dept) FROM Employee c JOIN c.empDetails p")
	public List<EmpReponse> getJoinInformation();
}
