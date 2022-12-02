package com.sriteja.oops;

/**
 * crating the main class to access the abstract class
 * **/
public class AbstractDemoImpl extends AbstractionDemo{

	/**
	 * first parent class constructor data will print
	 * second child class constructor data will print
	 ***/
	AbstractDemoImpl(){
		System.out.println("subclass AbstractDemoImpl constructor.........");
	}
	@Override
	public void getMyName() {	//method overriding 
		
		System.out.println("My Name is Teja");
	}

	
	public void getMySchool() {
		System.out.println("Z.P.H School.....");
	}

}
