package com.example.demo.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class EmployeeIdentity implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String companyId;
	
	public EmployeeIdentity() {
		
	}
	
	public EmployeeIdentity(String id, String companyId) {
		super();
		this.id = id;
		this.companyId = companyId;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	@Override
	public int hashCode() {
		return Objects.hash(companyId, id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeIdentity other = (EmployeeIdentity) obj;
		return Objects.equals(companyId, other.companyId) && id == other.id;
	}
	
	
	

}
