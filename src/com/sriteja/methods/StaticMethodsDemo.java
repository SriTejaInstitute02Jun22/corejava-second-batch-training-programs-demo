package com.sriteja.methods;

public class StaticMethodsDemo {

	//main method creation
	public static void main(String args[]) {
		
		String  myId = "CR1020";
		String myCompanyName = "Capgemini";
		
		show();//static method calling
		StaticMethodsDemo.getMyName(myId);
		
		String companyName = getMyCompanyName(myCompanyName);
		System.out.println("=================Company Name :: "+companyName);
		
		char gender = getGender();
		System.out.println("*****Gender :: "+gender);
		
	}
	//creating the static method without parameter
	public static void show() {			//method creation
		System.out.println("Hi Team");
		String myName = "Ramesh";
		System.out.println("My Name is "+myName);
	}
	
	//creating the static method with parameter
	private static String getMyName(String myId) {
		System.out.println("My Id is :: "+myId);
		return myId;
	}
	
	//creating the static method without parameter and with return type
	private static String getMyCompanyName(String myCompanyName) {
		System.out.println("My Company Name :: "+myCompanyName);
		return myCompanyName;
	}
	
	//creating the static method
	private static char getGender() {
		char gender = 'M';
		return gender;
	}
	
}
