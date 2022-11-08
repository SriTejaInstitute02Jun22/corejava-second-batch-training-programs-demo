package com.sriteja.oops;

/***
 * When one object acquires all the properties and behaviors of a parent object, it is known as inheritance. 
	in this class we using class to class relations so we need to use extends keywords
 * */
public class EmployMain extends CompanyMain{

	public static void main(String[] args) {

		CompanyMain companyMain = new CompanyMain();	//parent class object creation
		companyMain.setCompamyDetails();
		System.out.println("=====================");
		companyMain.getCompanyNameAndEmail();
		
		System.out.println("My Name in Parent Class = "+companyMain.myName);
		System.out.println("My Company Id in Parent Class = "+companyMain.myId);
		
		//child class method calling
		new EmployMain().show();
	}
	
	public void show() {
		System.out.println();
		System.out.println();
		System.out.println("Hi Ramesh.........");
		System.out.println("By.........");
	}

}
