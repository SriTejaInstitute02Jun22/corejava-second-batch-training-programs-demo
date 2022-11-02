package com.sriteja.loops;

/**
 * for loops syntax
 * 			for(initialization; condition; increment/decrement){    
				//statement or code to be executed    
			}   
 * */
public class ForLoops {

	public static void main(String[] args) {

		for(int i = 10; i<=15; i++) {
			System.out.println("Hi....");
			System.out.println("I value "+i);
		}
		
		System.out.println();
		System.out.println();
		new ForLoops().display();
		
	}
	
	public void display() {
		for(int j = 5; j<9; j++) {
			System.out.println("Hello....");
			System.out.println("J value "+j);
		}
	}

}
