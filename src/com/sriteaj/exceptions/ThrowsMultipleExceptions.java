package com.sriteaj.exceptions;

public class ThrowsMultipleExceptions {

	public static void main(String[] args) {
		
		try {
			
			String myName = null;
			getMyName(myName); //method calling
			
		}catch(ArithmeticException ex) {
			System.out.println("Exception is --------"+ex);
			System.out.println("we handled the exception using try and catch block");
		}catch (NullPointerException ne) {
			System.out.println("My Name is not coming due to "+ne);
		}catch(IndexOutOfBoundsException ibe) {
			System.out.println("My Name is not coming due to "+ibe);
		}

	}

	public static void getMyName(String myName) throws ArithmeticException, NullPointerException, IndexOutOfBoundsException{  //method creation
		int i = 10;
		int j = 0;
		
		int k = i/j;
		
		if(k >=10) {
			System.out.println("K value "+k);
		}
		
		if(myName.length() >0) {
			System.out.println("My Name = "+myName);
		}
	}
}
