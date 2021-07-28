package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Comment;
import com.example.demo.entity.Post;
import com.example.demo.repo.CommentRepo;
import com.example.demo.repo.PostRepo;

@SpringBootApplication
public class OneToManyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OneToManyApplication.class, args);
	}

	
	@Autowired
	private PostRepo postRepo;
	
	@Autowired
	private CommentRepo commentRepo;

	@Override
	public void run(String... args) throws Exception {
		
		Post post = new Post("Program For One To Many", "Program For One To Many");
		
		Comment comment1= new Comment("Good");
		Comment comment2= new Comment("Very Good");
		Comment comment3= new Comment("Average");
		
		post.getComments().add(comment1);
		post.getComments().add(comment2);
		post.getComments().add(comment3);
		
		this.postRepo.save(post);
		
		
	}
	
	
	
}
