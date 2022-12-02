package com.sriteja.oops;

/**
 * crating the interface
 * 
 * interface can contain only abstract methods.
 * interface having all public static and final variables.
 * interface doesn't have any constructor.
 * directly we cann't create the object for the interface.
 * but using implementation class we can create the object for this interface.
 *
 * **/
public interface DemoInterface {

	//creating the variable
	public static final String MYSCHOOLNAME = "Z.P.H.School";
	
	//abstract method creation
	public void getAccountNumber();
	
	String getBankName(); 
	
	
}
