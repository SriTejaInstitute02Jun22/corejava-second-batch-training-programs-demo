package com.sriteja.oops;

public class SchoolInterfaceMain {

	public static void main(String[] args) {

		String schoolAddress = "Hyderabad School";
		//object creation for SchoolInterface with Implementation class
		/**
		 * 1.Interface and Implementation class
		 *
		 *	//syntax
		 *	InterfaceName objectName = new ImplementationClassName();
		 **/
		SchoolInterface schoolInterface = new SchoolInterfaceImpl();
		
		schoolInterface.displaySchoolName();
		String address = schoolInterface.getSchoolAddress(schoolAddress);
		
		System.out.println("School Address "+address);
	}

}
