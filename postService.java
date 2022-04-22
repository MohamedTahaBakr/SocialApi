package com.kindsonthegenius.demo.post;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kindsonthegenius.demo.location.Location;
import com.kindsonthegenius.demo.user.User;

@Service
public class postService {
		User user1 = new User(
			"u1", 
			"Jany", 
			"Lawrence",
			new Location("l1", "Lagos"),
			"Jany@gmail.com");
			
		User user2 = new User(
			"u2", 
			"Jadon", 
			"Mills",
			new Location("l2", "Asaba"),
			"Jadon@gmail.com");
	Post post1= new Post("p1","22-4-2022",user1,"This is the post number one");
	Post post2= new Post("p2","22-4-2022",user2,"This is the post number two");
			private List<Post> posts=Arrays.asList(post1,post2);
			
public List<Post> getAllPosts() {
		return posts;
		

}
}
