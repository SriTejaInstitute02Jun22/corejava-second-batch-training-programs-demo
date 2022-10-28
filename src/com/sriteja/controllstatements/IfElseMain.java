package com.sriteja.controllstatements;

public class IfElseMain {

	public static void main(String[] args) {

		int i = 20;
		int j = 25;
		
		display(i,j);//method calling 
	}
	
	public static void display(int i, int j) {
		
		if(i>=j) {
			System.out.println("Hi..........");
		}else {
			System.out.println("Buy.........");
		}
		
		System.out.println("=========");
		
		if(i>=j && j<30) {
			System.out.println("Hi Ram.....");
		}else {
			System.out.println("Buy Ram....");
		}
		
		System.out.println("==========");
		if(i>=j || j<30) {
			System.out.println("message...........");
		}else {
			System.out.println("message buy............");
		}
		
		System.out.println("================");
		if(i!=10) {
			System.out.println("Hi ........Arun");
		}else {
			System.out.println("Buy..........Arun");
		}
	}

}
