package com.sriteja.controllstatements;

public class IfElseIfStatementMain {

	public static void main(String[] args) {

		int i = 5;
		int j = 9;
		
		show(i, j); //method calling
		display(j, i);
	}
	public static void show(int i, int j) {		//method creation and implementation
		
		if(i>=9) {			//5>=9
			System.out.println("H1...........");
		}else if(j<10) {	//9<10
			System.out.println("H2................");
		}else if(i>=j) {	//5>=9
			System.out.println("H3...............");
		}else {
			System.out.println("Hi...........");
		}
	}
	
	
	public static void display(int j, int i) {
		
		if(i==j && 5==j) {	
			System.out.println("Hi Team...condition 1");
		}else if(i>i || 10==j) {	
			System.out.println("Hi..........condition 2");
		}else if(9!=j && i !=j) {	
			System.out.println("Team ..............condition 3");
		}else if(5>5 || 25==30) {	
			System.out.println("Bye......condition 4");
		}else {
			System.out.println("ending.............");
		}
	}
	

}
