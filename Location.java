package com.kindsonthegenius.demo.location;

public class Location {
	
	   private String id;
	   
	   private String name;
	   
	public Location(String string, String string2) {
		this.id=string;
		this.name=string2;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		
		this.id = id;
	}
	public String getName() {
		
		return name;
	}
	public void setName(String name) {
		
		this.name = name;
	}
	   
}
