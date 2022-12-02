package com.sriteja.oops;

public class AbstractionDemoMain {

	public static void main(String[] args) {

		/**
		 * creating the object for the abstract class
		 * 
		 * Syntax:
		 * AbstractionClassName objectName = new AbstractionImplementationClassName();
		 * 
		 * **/
		AbstractionDemo demo = new AbstractDemoImpl();
		
		demo.getMyMobileNumber(); //this is non abstract method
		
		demo.getMyName();   //this is abstract method
	}

}
