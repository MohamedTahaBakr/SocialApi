package com.kindsonthegenius.demo.location;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class locationController {
	@Autowired
	private locationServices locationn;
	   @RequestMapping(value = "/locationss")
	  public List<Location> gettAllLocations(){
		   return locationn.getAllLocations();
	   }

}
