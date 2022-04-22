package com.kindsonthegenius.demo.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {
	@Autowired
	private userService userservice;
	
	@RequestMapping(value = "/userss")
	public List<User> getallusers(){
		return userservice.getAllUsers();
	}
}
