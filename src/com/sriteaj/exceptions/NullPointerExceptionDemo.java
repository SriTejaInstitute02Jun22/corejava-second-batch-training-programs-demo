package com.sriteaj.exceptions;

public class NullPointerExceptionDemo {

	public static void main(String[] args) {
		
		NullPointerExceptionDemo nullPointerExceptionDemo = new NullPointerExceptionDemo();
		nullPointerExceptionDemo.getNullPointerException();
		
		nullPointerExceptionDemo.getArithmeticException();

	}
	
	//NullPointException examples
	public void getNullPointerException() {

		try {
			String myName = null;
			
			System.out.println("My Name Lenght "+myName.length());
			System.out.println("My Name :: "+myName);
			
		}catch(NullPointerException ex) {
			System.out.println("Exception Name "+ex);
			System.out.println("We don't have any name......");
		}
	}
	
	//ArithmeticException
	public void getArithmeticException() {

		System.out.println();
		try {
			//ArithmeticException
			int i = 10;
			int j = 0;
			
			int k = i/j;
			
			System.out.println("K values = "+k);
			
		}catch(Exception ex) {
			System.out.println("Exceptoin is "+ex);
			System.out.println("We don't have K values......");
		}
	}
	
	

}
