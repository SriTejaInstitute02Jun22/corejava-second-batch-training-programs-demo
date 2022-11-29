package com.sriteja.oops;

public class SchoolInterfaceImpl implements SchoolInterface{

	//overriding
	public void displaySchoolName() {	//method implementation
		System.out.println("Hi............");
	}
	
	//overriding
	public String getSchoolAddress(String schoolAddress) { //method implementation
		System.out.println("Hello.............");
		return schoolAddress;
	}
}
