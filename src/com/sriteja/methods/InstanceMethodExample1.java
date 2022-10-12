package com.sriteja.methods;

public class InstanceMethodExample1 {

	//creating the main method.
	public static void main(String args[]) {
		
		int myId = 2010;
		
		InstanceMethodExample1 instituteDetails = new InstanceMethodExample1();
		instituteDetails.getInstituteDetails(); //method calling
		
		instituteDetails.show(myId);  //method calling
				
		System.out.println("ending.............");
	}
	
	/**
	 * Syntax:- How to create instance method without parameters
	 * 	access_modifier return_type method_name(){
			//method body
		}
	 */
	//creating the instance method without prameters
	public void getInstituteDetails() {	//method creations
		System.out.println("Institute  Name is Sri Teja");
		System.out.println("Institute Mobile 8801826101");
		System.out.println("Institute Address is Hyderabad");
		System.out.println("Institute Email Id is ramesh@gmail.com");
	}
	
	/**
	 * 
		Syntax:- How to create instance method with parameters
				access_modifier return_type method_name(data_type variable_name){
					//method body
				}
	 * */
	//creating the instance method with parameter
	private void show(int myId) {		//method creation
		System.out.println("My Id :: "+myId);
	}
	
		

}
