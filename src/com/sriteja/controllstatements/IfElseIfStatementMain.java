package com.sriteja.controllstatements;

public class IfElseIfStatementMain {

	public static void main(String[] args) {

		int i = 5;
		int j = 9;
		
		show(i, j); //method calling
	}
	public static void show(int i, int j) {		//method creation and implementation
		
		if(i>=9) {
			System.out.println("H1...........");
		}else if(j<10) {
			System.out.println("H2................");
		}else if(i>=j) {
			System.out.println("H3...............");
		}else {
			System.out.println("Hi...........");
		}
	}

}
