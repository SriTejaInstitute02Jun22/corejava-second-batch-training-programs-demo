package com.sriteja.loops;

public class ForLoopWithArrays {

	public static void main(String[] args) {
		
		//creating the array object
		int arr[] = {2, 3,4,6,8};
		for(int i = 0; i<arr.length; i++) {
			System.out.println("array value = "+arr[i]);
		}
		
		System.out.println();
		String studentNames[] = {"Janaki", "Naresh", "Suresh", "Madhavi"};
		for(int i = 0; i<studentNames.length; i++) {
			System.out.println("Student Name = "+studentNames[i]);
		}
		
	}

}
