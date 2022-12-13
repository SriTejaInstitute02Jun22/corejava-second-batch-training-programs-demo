package com.sriteaj.exceptions;

/**
 * Exception handling is a mechanism to handle runtime errors, so that normal flow of the program can be maintained.
	we can handle the exceptions using try and catch block
	we have different keywords to handle runtime 
	1.try
	2.catch
	3.finally
	4.throw
	5.throws 
 * */
public class ArithmeticExceptionDemo {

	public static void main(String[] args) {

		int s = 1200;
		int r = 0;
		/***
		 * Syntax:
		 * 		try{
		 * 			//writing the code
		 * 		}catch(ExceptionName){
		 * 			//handle the exception/message
		 * 		}
		 * */
		try {
			int z = s/r; //1200/0	//error throwing here
		}catch(ArithmeticException ae) {
			System.out.println("Exception are coming........");
		}
		
		System.out.println("Hi...............");
		
		System.out.println("Hello Sri...............");
	}

}
