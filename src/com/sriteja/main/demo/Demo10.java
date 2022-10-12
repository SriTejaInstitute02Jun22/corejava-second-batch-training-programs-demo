package com.sriteja.main.demo;

/**
 * This class is creating to explain the Variable examples in Java
 * @author ramesh
 * @version 1.0
 * */
public class Demo10 {

	//main method creation
	public static void main(String args[]) {
		
		//Object creation
		Demo10 demo = new Demo10();
		int number = demo.m1();
		System.out.println("Display the "+number);
	}
	
	//instance methods
	public int m1() {
		System.out.println("Sri Teja");
		return 10;
	}
}
