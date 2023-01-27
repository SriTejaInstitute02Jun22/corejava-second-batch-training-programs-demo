package com.sriteja.collections;

import java.util.HashMap;
import java.util.Map;

public class MapWithHashMap {

	public static void main(String[] args) {
		
		Map<String, String> details = getMyDetails();  //method calling
		System.out.println("My Details ========="+details);
	}
	
	public static Map<String, String> getMyDetails(){  //method creation
		
		//creating the map object
		Map<String, String> myDetails = new HashMap<>();
		//adding the values into map object
		myDetails.put("name", "Ramesh"); 		//myDetails.put(key, value);
		myDetails.put("companyName", "Capgemini");
		myDetails.put("mobile", "+9172323232");
		myDetails.put("email", "ramesh@gmail.com");
		myDetails.put("city", "Hyderabad");
		
		return myDetails;
		
	}

}
