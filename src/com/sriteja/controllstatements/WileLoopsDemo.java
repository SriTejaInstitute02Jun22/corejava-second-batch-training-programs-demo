package com.sriteja.controllstatements;

/**
 * while loop syntax
 * 	while (condition){    
		//code to be executed   
		//Increment (or) decrement statement  
	} 

 * */
public class WileLoopsDemo {

	public static void main(String[] args) {

		int id = 12;
		String company = "HCL";
		
		//method calling creating the object for current class and using that object to call the method
		WileLoopsDemo wileLoopsDemo = new WileLoopsDemo();	
		wileLoopsDemo.dispay(id, company);	//method calling
		
		int companyId = 20;
		//method calling using the constructor
		new WileLoopsDemo().show(companyId, company); //method calling
	}
	
	
	private void dispay(int id, String company) {
		
		while(id<=16) {
			System.out.println("Comapany = "+company+" Id = "+id);
			id++;
		}
		System.out.println("fail the while condition................id = "+id);
		
	}
	
	private void show(int companyId, String company) {
		System.out.println();
		while(companyId<=16) {
			System.out.println("Comapany = "+company+" Id = "+companyId);
			companyId++;
		}
		System.out.println("show method end................id = "+companyId);
	}

}
