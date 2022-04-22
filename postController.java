package com.kindsonthegenius.demo.post;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class postController {
	
	@Autowired
	
	public postService post;
	
	@RequestMapping(value = "/postss")
	
	public List<Post> getAllposts() {
	
		return post.getAllPosts();
}
}