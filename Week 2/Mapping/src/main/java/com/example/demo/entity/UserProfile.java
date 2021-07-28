package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="profile_table")
public class UserProfile 
{
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	private String address;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL, mappedBy="userProfile")
	private User user;
	
	
	public UserProfile() {
		
	}
	
	public UserProfile(String address, Gender gender) {
		super();
		this.address = address;
		this.gender = gender;
	}
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

}
