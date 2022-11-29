package com.sriteja.oops;

/**
 * same method name and with different parameters in same class is called overloading
 * */
public class OverloadingExamples {

	public static void main(String[] args) {

		String myName = "Sri";
		int id = 102;
		
		new OverloadingExamples().display();
		
		OverloadingExamples overloadingExamples = new OverloadingExamples();
		overloadingExamples.display(myName, id);
		overloadingExamples.display(myName);
	}

	
	//non-static method
	//below methods are called method overloading
	private void display() {
		System.out.println("Hi Bass");
	}
	
	private void display(String myName, int id) {
		System.out.println("Hi Bass");
		System.out.println("My Name = "+myName);
		System.out.println("Id = "+id);
		
	}
	
	private void display(String myName) {
		System.out.println("My Name==========="+myName);
	}
}
