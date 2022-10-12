package com.sriteja.variables;

public class VariablesDemo {

	// creating the instance variables
	int id = 10; // Syntax:- data_type variable_name = value;

	//static variable creating 
	static int empId = 223; // Syntax:  static data_type variable_name = value;
	
	
	// creating the main method
	public static void main(String args[]) {

		// creating the local variables
		int number = 20; // Syntax:- data_type variable_name = value;
		int j = 30;		// Syntax:- data_type variable_name = value;

		// how to create the Object to current class
		/*
		 * Syntax: to create Object for the class 
		 * 		Class_name variable_name = new Class_name();
		 */
		VariablesDemo demo = new VariablesDemo();
		
		System.out.println("Number :: "+number);
		System.out.println(j);
		System.out.println(empId);
		System.out.println("Employe  ID "+demo.id);
		
		final int i = 10;
		System.out.println(i);
		
	}
	
	
	
}
