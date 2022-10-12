package com.sriteja.methods;

import com.sriteja.bean.EmployDetails;

public class InstanceMethodDemo {

	//creating the main method
	public static void main(String args[]) {
		
		//crating the object for current class 
		/**
		 * Syntax: how to create the class
		 * 	Class_name reference_variable_name/object_name = new Class_name();
		 * */
		InstanceMethodDemo demo = new InstanceMethodDemo();
		demo.show();	//method calling
		
	}
	
	
	/**
	 * Syntax:without return type and without parameters
			access_modifer return_type method_name(){
				//method body
			}
	 * */
	//instance method or non static method
	public void show() {	//method declaration
		System.out.println("Hi Sri Teja"); //method body
	}
}
