package com.sriteja.oops;
/**
 * crating the abstract class
 * 
 * abstract class can contain both abstract methods and non abstract methods.
 * abstract class having instance variable, static and final variables also.
 * abstract class having constructor also.
 * directly we cann't create the object for the abstract class.
 * but using subclass we can create the object for this abstract class.
 *
 * **/
public abstract class AbstractionDemo {

	/**
	 * abstract method creation
	 * 
	 * abstract method doesn't have any method body, is called abstract method
	 * **/
	public abstract void getMyName();
	
	
	/**
	 * non abstract method or regular method creation
	 * 
	 * non abstract method or regular method should have the method body
	 * **/
	public void getMyMobileNumber() {
		int myMobileNumber = 83939823;
		System.out.println("My Mobile Number = "+myMobileNumber);
	}
	
	//non static variable or instance variable creating
	int id = 133;
	
	//creating the static variables
	public static final String MYNAME = "Sri";
	
	//creating the constructor in abstract class.
	AbstractionDemo(){
		System.out.println("this is abstract class constructor.............");
	}
	
}
