package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entiity.EmpDetails;

public interface EmpDetailsRepo extends JpaRepository <EmpDetails,Integer> {

}
