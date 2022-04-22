package com.kindsonthegenius.demo.post;

import com.kindsonthegenius.demo.user.User;

public class Post {
 
	   private String id;
	   private String postdate;
	   private User user;
	   private String details;
	public Post(String string, String string2, User user1, String string3) {
this.id=string;
this.postdate=string2;
this.user=user1;
this.details=string3;

	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPostdate() {
		return postdate;
	}
	public void setPostdate(String postdate) {
		this.postdate = postdate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
}
