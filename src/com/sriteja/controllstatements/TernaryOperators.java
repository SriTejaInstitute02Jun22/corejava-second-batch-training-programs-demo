package com.sriteja.controllstatements;

/***
 * below class is having ternary operator examples
 * syntax: condition1 ? Expression1 : Expression2;								//single condition checking
 * 		   condition1 ? condition2 ? Expression1 : Expression2 : Expression3;	//to check multiple conditions
 * */
public class TernaryOperators {

	public static void main(String args[]) {
		
		String myName = "Ramesh";
		int i = 20;
		TernaryOperators ternaryOperators = new TernaryOperators();
		ternaryOperators.ternaryOperatorsDemo(myName, i);  //method calling
		
		new TernaryOperators().myDetails(myName, i);  //method calling
	}
	
	//ternary operators 
	private void ternaryOperatorsDemo(String myName, int i) {
		System.out.println("condition true case");
		//if else statement 
		if(myName=="Ramesh") {
			System.out.println("My Name is "+myName);
		}else {
			System.out.println("I don't have any name...........");
		}
		
		System.out.println();
		//ternary operators
		String response = (myName=="Ramesh")?"My Name is "+myName:"I don't have any name...........";
		System.out.println(response);
		
		System.out.println("============");
		System.out.println("condition false case");
		if(myName=="Naresh") {
			System.out.println("My Name is "+myName);
		}else {
			System.out.println("I don't have any name...........");
		}
		
		System.out.println();
		//ternary operators
		String response1 = (myName=="Naresh")?"My Name is "+myName:"I don't have any name...........";
		System.out.println(response1);
		
	}
	
	private void myDetails(String myName, int i) {
		System.out.println();
		System.out.println();
		System.out.println("condition true case with multiple conditions");
		System.out.println("if-else with inner loop");
		if(i>15 && myName=="Ramesh") {
			if(i<=25) {	//inner statement
				System.out.println("My Name is "+myName+" and value = "+i);
			}else {
				System.out.println("My Name is "+myName+" I don't have any value..");
			}
		}else {
			System.out.println("I don't have any name and value also");
		}
		
		System.out.println();
		System.out.println("ternary operators");
	String response = (i>15 && myName=="Ramesh")?(i<=25)?"My Name is "+myName+" and value = "+i:"My Name is "+myName+" I don't have any value..":"I don't have any name and value also";
	System.out.println(response);
		
	}
}
