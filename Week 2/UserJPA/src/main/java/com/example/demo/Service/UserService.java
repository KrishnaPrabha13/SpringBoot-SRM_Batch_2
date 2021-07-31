package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Entity.User;
import com.example.demo.Repository.UserRepo;

@Service
public class UserService
{
	@Autowired
	private UserRepo repo;
	
	public User saveUser(User user) {
		return repo.save(user);
	}
	
	public List<User> saveUsers(List<User> users) {
		return repo.saveAll(users);
	}
	
	
	public List<User> getUsers(){
		return repo.findAll();
	}
	
	public User getUserById(int id)
	{
		return repo.findById(id).orElse(null);
	}
	
	public String deleteUser(int id) {
		repo.deleteById(id);
		return "User Deleted" +id;
	}
	
	public User updateUser(User user) {
		User existingUser = repo.findById(user.getId()).orElse(null);
		existingUser.setName(user.getName());
		existingUser.setAge(user.getAge());
		return repo.save(existingUser);
	}
}


