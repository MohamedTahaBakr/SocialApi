package com.kindsonthegenius.demo.location;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class locationServices {


		Location location1 = new Location("l1", "This is the Location number one");
		Location location2 = new Location("l2", "This is the Location number two");
		Location location3 = new Location("l3", "This is the Location number three");	
		private List<Location> locations=Arrays.asList(location1,location2,location3);
public List<Location> getAllLocations() 
{	
		return locations;
	   }
}
