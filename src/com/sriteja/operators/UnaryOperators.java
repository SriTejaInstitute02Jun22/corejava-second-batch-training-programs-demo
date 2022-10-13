package com.sriteja.operators;

/***
 * This class is contain Unary Operators program examples.
 * //Increment Operator		-->express++
	Postfix: First Operation and then increment.	
	Prefix: First increment and then perform some Operation.

	//Decrement Operator	-->express--
	Postfix: First Operation and then decrement.
	Prefix: First decrement and then perform some Operation.
 * */
public class UnaryOperators {
 
	public static void main(String[] args) {

		int age = 10;
		int j = 20;
		
		
		//Postfix: First Operation and then increment.	
		System.out.println(age++);	//first operation  = 10;
			//age +1 ->10 +1 = 11	-> after operation is going increment.
		System.out.println(age);	//11
		
		System.out.println();
		
		//Postfix: First Operation and then decrement.
		System.out.println(j--);	//first operation = 20;
			//j-1 -> 20-1 = 91
		System.out.println(j); //19
		
		System.out.println();
		
		int k = 5;
		int z = 8;
		
		//Prefix: First increment and then perform some Operation.
		//int k = 5; -> 5+1 =6
		System.out.println(++k);//	++express
		System.out.println(k); //
		
		System.out.println();
		//Prefix: First decrement and then perform some Operation.
		//int z = 8; -> 8-1 =7
		System.out.println(--z);//	++express
		System.out.println(z); //
		
	}

}
