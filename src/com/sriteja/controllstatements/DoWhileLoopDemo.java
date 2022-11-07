package com.sriteja.controllstatements;

/**
 * do while loop syntax 
 * 		do{     
 * 				//code to be executed / loop body  
 * 				//update statement  
 * 		} while (condition);
 */
public class DoWhileLoopDemo {

	public static void main(String[] args) {

		int i = 5;
		int j = 9;
		String myRoll = "Software Engineer";

		new DoWhileLoopDemo().get(i, j, myRoll); // method calling

		int k = 10;
		new DoWhileLoopDemo().show(k, j, myRoll); // method calling
	}

	private void get(int i, int j, String myRoll) { // method creation

		// do while loop creating
		do {
			System.out.println("I = " + i + " J = " + j + "......my roll " + myRoll);
			i++;
		} while (j > i);
		System.out.println("codition is false in do while loop.........");
		System.out.println("I = " + i + " J = " + j + " My Roll = " + myRoll);
	}

	private void show(int k, int j, String myRoll) { // method creation
		System.out.println();
		// do while loop creating
		do {
			System.out.println("K = " + k + " J = " + j + "......my roll " + myRoll);
			k++;
		} while (j > k);//(9>11)
		System.out.println("show method, codition is false in do while loop.........");
		System.out.println("K = " + k + " J = " + j + " My Roll = " + myRoll);
	}
}
