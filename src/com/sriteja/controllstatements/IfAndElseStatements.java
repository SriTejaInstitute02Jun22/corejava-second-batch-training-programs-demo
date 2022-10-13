package com.sriteja.controllstatements;

/***
 * This class is containing if and else statement examples.
 * * Syntax: if(condition){
 * 				statement;
 * 			}
 * 
 * 
 * Syntax: if(condition){
 * 				statement;
 * 			}else{
 * 				statement;
 * 			}
 * */
public class IfAndElseStatements {

	public static void main(String[] args) {

		int i = 10;
		int j =  20;
		
		IfAndElseStatements obj = new IfAndElseStatements();
		obj.display(i, j);		//method calling 
		
		new IfAndElseStatements().show(j, i);
	}
	
	
	//Instance method or non static method creation
	private void display(int i, int j) {
		
		if(i <= j) {
			System.out.println("I less than J");
			System.out.println("Hi");
		}

		System.out.println("welcome...");
		
		if(j<=i) {
			System.out.println("I less than J");
		}
		
		System.out.println("ending..........");
		
		if(j>i)
		System.out.println("J is less than I");
		
	/*	if(j>i) {
			System.out.println("J is less than I");
		}
	*/
	}
	
	
	//Instance method or non static method creation
	private void show(int j, int i) {
		System.out.println();
		if(i>=10) {
			System.out.println("I equal to 10");
		}else {
			System.out.println("hi");
		}
		
		System.out.println("end");
		
		if(25==j) {
			System.out.println("25 is equals J");
		}else {
			System.out.println("25 is not equals J");
		}
	}

}
