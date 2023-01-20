package com.sriteja.collections;

import java.util.ArrayList;
import java.util.List;

public class ListWithArrayListExamples {

	public static void main(String[] args) {

		String myName = getName(); //method calling
		System.out.println("My Name = "+myName);
		
		List<String> institutesStudentNames = getListOfNames();
		System.out.println("My Institute Student Names = "+institutesStudentNames);
		
		List<Integer> listOfStudentIds = getListOfStudentIds();
		System.out.println("List Of My Student ID's = "+listOfStudentIds);
		
		//get the data from list object based on index number
		System.out.println("Get the 4th index data from the list = "+listOfStudentIds.get(3));
		
		
	}
	
	public static List<Integer> getListOfStudentIds(){
		
		/**
		 * Syntax:-Interface_Name<Data_type/User Object> variable_Name = new Implementaion_Class_Name<>();
         *	Ex:-List<Integer> names = new ArrayList<>();
		 * **/
		//creating the List object 
		List<Integer> listOfIds = new ArrayList<>();
		listOfIds.add(10);//index number [0]
		listOfIds.add(23);//[1]
		listOfIds.add(5);//[2]
		listOfIds.add(40);//[3]
		listOfIds.add(null);//[4]
		listOfIds.add(18);//[5]
		listOfIds.add(null);//[6]
		listOfIds.add(23);//[7]
		
		return listOfIds;
		
	}
 
	//get the list of names
	public static List<String> getListOfNames() { //method creation
		
		/**
		 * Syntax:-Interface_Name<Data_type/User Object> variable_Name = new Implementaion_Class_Name<>();
         *	Ex:-List<String> names = new ArrayList<>();
		 * **/
		//creating the List object 
		List<String> listOfNames = new ArrayList<>();
		listOfNames.add("Ramesh");
		listOfNames.add("Anil");
		listOfNames.add("Dhilip");
		listOfNames.add("Shireesha");
		listOfNames.add("Jyothis");
		listOfNames.add("Naresh");
		listOfNames.add("Anil");
		listOfNames.add(null);
		
		return listOfNames;
	}
	
	public static String getName() { //method creation
		
		String name = "Babu";
		return name;
	}
	
}
