package com.sriteja.oops;

/***
 * When one object acquires all the properties and behaviors of a parent object, it is known as inheritance. 
	in this class we using class to class relations so we need to use extends keywords
 * */
public class EmployMain extends CompanyMain{

	String myDOB = "01-May-2011"; // instance 
	
	//creating the Constructor
	public EmployMain() {
		System.out.println("Child Class---------EmployeMain Constructor............");
	}
	
	public static void main(String[] args) {

	/*	CompanyMain companyMain = new CompanyMain();	//parent class object creation
		companyMain.setCompamyDetails();
		System.out.println("=====================");
		companyMain.getCompanyNameAndEmail();
		
		System.out.println("My Name in Parent Class = "+companyMain.myName);
		System.out.println("My Company Id in Parent Class = "+companyMain.myId);
	*/	
		
		EmployMain employMain = new EmployMain();
		//we can accept any values  or properties or methods from the parent class to child class this is called inheritance.
		System.out.println("My Id from Parent Class = "+employMain.myId);
		System.out.println("My Name form Parent Class = "+employMain.myName);
		
		System.out.println("My DOB Current Class variable = "+employMain.myDOB);
		
		
		System.out.println("Get Company Details..");
		employMain.setCompamyDetails();
		
		
		
		//child class method calling
		new EmployMain().show();
		
		System.out.println();
		System.out.println("===================");
		//get the data from CompanyHeadOfficeDetails
		employMain.getHeadOffficeAddress();
	}
	
	public void show() {
		System.out.println();
		System.out.println();
		System.out.println("Hi Ramesh.........");
		System.out.println("By.........");
	}

}
