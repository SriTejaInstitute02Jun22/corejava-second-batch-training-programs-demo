package com.sriteja.operators;

/**
 * this class is going to create the Relational Operators
 * symbols: <, >, <=, >=, instanceof, ==, !=
 * */
public class RelationalOperators {

	public static void main(String[] args) {

		int i = 8;
		int k = 4;
		
		System.out.println("I<K = "+(i<k));	
		System.out.println("I>K = "+(i>k));
		System.out.println("I<=K = "+(i<=k));
		System.out.println("I>=K = "+(i>=k));
		System.out.println("I==K = "+(i==k));
		System.out.println("I!=K = "+(i!=k));
		
		A a = new A();
		B b = new B();
		
	
		System.out.println(a instanceof B);
		
		System.out.println(b instanceof A);
		
	}

}
class A{
	public void show() {
		System.out.println("Hi A class");
	}
}

class B extends A{
	public  void display() {
		System.out.println("Hi B class");
	}
}
