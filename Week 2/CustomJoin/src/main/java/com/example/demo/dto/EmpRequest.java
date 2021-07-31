package com.example.demo.dto;

import javax.persistence.Entity;

import com.example.demo.entiity.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
public class EmpRequest 
{
	private Employee employee;

	public EmpRequest(Employee employee) {
		super();
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	

}
