package com.sriteaj.exceptions;

public class ThrowsExamples {

	public static void main(String args[]) {
		
		
		try {
			
			
			String myName = null;
			getMyName(myName); //method calling
			
			m1();//method calling
			
		}catch(ArithmeticException ex) {
			System.out.println("Exception is --------"+ex);
			System.out.println("we handled the exception using try and catch block");
		}catch (NullPointerException ne) {
			System.out.println("My Name is not coming due to "+ne);
		}
	}
	
	
	//method cration
	public static void m1() throws ArithmeticException{ //method creation
		int i = 10;
		int j = 0;
		
		int k = i/j;
		
		if(k >=10) {
			System.out.println("K value "+k);
		}
	}
	
	public static void getMyName(String myName) throws NullPointerException{  //method creation
		
		if(myName.length() >0) {
			System.out.println("My Name = "+myName);
		}
	}
}
