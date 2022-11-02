package com.sriteja.controllstatements;

public class TernaryOperatorsDemo {

	public static void main(String[] args) {

		String myName = "Babu";
		int i = 10;
		
		//single condition check with ternary operator
		String response = (i!=32)?"Hello":"Bye";
		System.out.println(response);
		
		System.out.println();
		if(i!=32) {
			System.out.println("Hello");
		}else {
			System.out.println("Bye");
		}
		
		System.out.println("=============");
		
		//2 conditions check with ternary operator
		String response1 = (myName == "Babu")? (i==10)?"I = 10":"I not equals 10" :"my name is not "+myName;
		System.out.println(response1);
		
		System.out.println();
		if(myName == "Babu") {	
			if(i==10) {	//inner loops
				System.out.println("I = 10");
			}else {
				System.out.println("I not equals 10");
			}	
		}else {
			System.out.println("my name is not "+myName);
		}	
	}

}
