package com.sriteja.loops;

/**
 * Nested For loop syntax
 * for(initialization1; condition1; increment1/decrement1){    
	          //statement or code to be executed   
		for(initialization2; condition2; increment2/decrement2){    //inner for loop
		//statement or code to be executed    
		}   
	}   
 * */
public class NestedForLoops {

	public static void main(String[] args) {

		//Outer for loop
		for(int i=1; i<4; i++) {
			System.out.println("I values = "+i);
			
			
			//inner for loop
			for(int j=0; j<i; j++) {
				System.out.println("I values = "+i+ " and J value = "+j);
			}
			
			System.out.println();
			
		}
		
	}

}
