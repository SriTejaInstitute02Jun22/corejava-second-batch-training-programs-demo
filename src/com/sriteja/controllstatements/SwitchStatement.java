package com.sriteja.controllstatements;

public class SwitchStatement {

	public static void main(String[] args) {

		int i = 5;
		int j = 10;
		display(i,j);
		
		String myName = "SriTeja";
		show(myName);
		dispalyMyName(myName);
	}
	
	public static void display(int i, int j) {
		
		int k = i*j;
		//switch statement
		switch(k) {
			case 10:
				System.out.println("case1");
				break;
			case 50:
				System.out.println("case2");
				break;
			case 60:
				System.out.println("case3");
				break;
			case 25:
				System.out.println("case4");
				break;
			default: 
				System.out.println("default one.....");
		}
	}
	
	
public static void show(String myName) {
		
		//switch statement
		switch(myName) {
			case "Ram":
				System.out.println("case1..........");
				break;
			case "Chandra":
				System.out.println("case2...........");
				break;
			case "Anil":
				System.out.println("case3...............");
				break;
			case "Dhileep":
				System.out.println("case4..........");
				break;
			default: 
				System.out.println("default one.....show(String myName)");
		}
	}

public static void dispalyMyName(String myName) {
	
	//switch statement
	switch(myName) {
		case "Ram":
			System.out.println("case1..........");
			break;
		case "Chandra":
			System.out.println("case2...........");
			break;
		case "SriTeja":
			System.out.println("Hi SriTeja case 3");
			break;
		case "Anil":
			System.out.println("case4...............");
			break;
		case "Dhileep":
			System.out.println("case5..........");
			break;
		default: 
			System.out.println("default one.....");
	}
}
}
