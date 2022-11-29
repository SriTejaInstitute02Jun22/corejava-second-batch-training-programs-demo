package com.sriteja.oops;

public class SchoolMain {

	public static void main(String[] args) {
		
		String schoolName = "Hyderbad School";
		//creating the object Parent class with Child class
		/**
		 * 1.Parent class and Chaild class
		 *
		 *	//syntax
		 *	ParentClassName objectName = new ChaildClassName();
		 **/
		PSchool school = new CSchool();
		
		String  mySchoolName = school.getSchoolName(schoolName);
		System.out.println("My School Name = "+mySchoolName);
		

		school.getSchoolAddress();
	}

}
