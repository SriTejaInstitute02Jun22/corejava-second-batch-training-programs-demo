package com.sriteja.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetWithHastSetExamples {

	public static void main(String[] args) {
		
		Set<String> companyNames = getSetOfCompanyNames(); //method calling
		System.out.println("Set of Company Names ===="+companyNames);
		
		//TreeSet
		Set<Integer> employIds = getEmployeIds();
		System.out.println("Employee Ids in accending order ========="+employIds);
		
	}
	
	//method creation
	public static Set<String> getSetOfCompanyNames(){  //method creation
		
		/**
		 * Syntax:-Interface_Name<Data_type/User Object> variable_Name = new Implementaion_Class_Name<>();
         *	Ex:-Set<String> names = new HashSet<>();
		 * **/
		//creating the set object
		Set<String> setOfCompanyNames = new HashSet<>();
		setOfCompanyNames.add("Google");
		setOfCompanyNames.add("IBM");
		setOfCompanyNames.add("HCL");
		setOfCompanyNames.add("Capgemini");
		setOfCompanyNames.add("Google");	//Duplicate company name
		setOfCompanyNames.add(null);
		setOfCompanyNames.add(null);		//Multiple null values adding
		
		return setOfCompanyNames;
		
	}
	
	
	//TreeSet impl
	public static Set<Integer> getEmployeIds(){
		
		//creating the set object using treeset
		Set<Integer> empIds = new TreeSet<>();
		empIds.add(3);
		empIds.add(5);
		empIds.add(1);
		empIds.add(2);
		empIds.add(4);
		
		return empIds;
	}

}
