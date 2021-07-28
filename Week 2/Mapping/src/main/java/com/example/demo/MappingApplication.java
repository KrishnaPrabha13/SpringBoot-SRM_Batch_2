package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Gender;
import com.example.demo.entity.User;
import com.example.demo.entity.UserProfile;
import com.example.demo.repo.UserProfileRepo;
import com.example.demo.repo.UserRepo;

@SpringBootApplication
public class MappingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MappingApplication.class, args);
	}
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private UserProfileRepo userProfileRepo;

	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setName("Raj");
		
		UserProfile userProfile = new UserProfile();
		userProfile.setAddress("Chennai");
		userProfile.setGender(Gender.MALE);
		
		
		user.setUserProfile(userProfile);
		userProfile.setUser(user);
		
		userRepo.save(user);
	}
}
