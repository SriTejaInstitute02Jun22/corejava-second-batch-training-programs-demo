package com.sriteja.operators;

/**
 * This is class is implemented equal operation in Relational Operators
 * 	==, !=
 * **/
public class EqualOperators {

	public static void main(String args[]) {
		
		int i = 10;
		int j = 30;
		String name = "Teja";
		String str = "Ramesh";
		String myName = "Ramesh";
		
		System.out.println("I is equal to J "+(i==j));
		System.out.println(j==i);
		System.out.println(i!=j);
		System.out.println(j!=i);
		System.out.println(name==str);
		System.out.println(name!=str);
		System.out.println(name.equals(str));
		System.out.println(str.equals(myName));
	}
}
