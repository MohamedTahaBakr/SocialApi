package com.kindsonthegenius.demo.user;

import com.kindsonthegenius.demo.location.Location;

public class User {
	
	private String id;
	
	private String fName;
	
	private String lName;
	
	private Location location;
	
	private String Email;
	
	public User(String string, String string2, String string3, Location location2, String string4) {

		this.id=string;
		this.fName=string2;
		this.lName=string3;
		this.location=location2;
		this.Email=string4;
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
}