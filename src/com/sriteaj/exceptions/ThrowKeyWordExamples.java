package com.sriteaj.exceptions;

public class ThrowKeyWordExamples {

	public static void main(String[] args) {

		String myName = null;
		
		//String myName = "Babu";
	
		try {
			 getMyName(myName);
		}catch(NullPointerException ex) {
			System.out.println("My Name is not available.......");
		}
		
		
	}
	
	public static void getMyName(String myName) {
		
		if(myName.equals("Babu")) {
			
			System.out.println("My Name is =========="+myName);
		}else {
			
			throw new NullPointerException();
			
		}
		
	}

}
