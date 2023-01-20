package com.sriteja.collections;

import java.util.LinkedList;
import java.util.List;

public class ListWithLinkedListExamples {

	public static void main(String args[]) {
		
		List<String> bookNames = getBookNames();
		System.out.println("Book Names = "+bookNames);
		
	}
	
	public static List<String> getBookNames(){
		
		//creating the list object
		List<String> listOfBooks = new LinkedList<>();
		listOfBooks.add("Java");
		listOfBooks.add("Spring Framework");
		listOfBooks.add("Spring Boot");
		listOfBooks.add("Design Patterns");
		listOfBooks.add("Hibernate");
		listOfBooks.add("Oracle");
		
		return listOfBooks;
	}
}
