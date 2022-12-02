package com.sriteja.oops;

public class DemoInterfaceMain {

	public static void main(String[] args) {

		/**
		 * creating the object for the interface
		 * 
		 * Syntax:
		 * InterfaceName objectName = new ImplementationClassName();
		 * 
		 * **/
		DemoInterface bankDetails = new DemoInterfaceImpl();
		bankDetails.getAccountNumber();  // method calling
		
		String bankName = bankDetails.getBankName();		// method calling
		System.out.println("Bank Name = "+bankName);	
	}

}
