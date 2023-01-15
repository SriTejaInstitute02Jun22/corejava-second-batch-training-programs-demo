package com.sriteaj.exceptions;

public class ExceptionExample {

	public static void main(String[] args) {
		try {

			//String myName = null;
			//getMyName(myName); // method calling

			m1();// method calling

		} catch (Exception ex) {
			System.out.println("we are not able to getting proper response due to exception such as "+ex);
		} 
	}

	// method cration
	public static void m1() throws ArithmeticException { // method creation
		int i = 10;
		int j = 0;

		int k = i / j;

		if (k >= 10) {
			System.out.println("K value " + k);
		}
	}

	public static void getMyName(String myName) throws NullPointerException { // method creation

		if (myName.length() > 0) {
			System.out.println("My Name = " + myName);
		}
	}

}
