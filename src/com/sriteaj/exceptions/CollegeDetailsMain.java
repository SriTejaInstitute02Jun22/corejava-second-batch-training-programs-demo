package com.sriteaj.exceptions;
/**
 * this class is check our college login credentials
 * username=SriTeja 
 * password=teja123
 * */
public class CollegeDetailsMain {

	public static void main(String args[]) {
		
		String userName = null;
		String password = "teja123";
		
		new CollegeDetailsMain().loginCollegeSite(userName, password);
		
	}
	
	//write the method to check the College Login credential
	public void loginCollegeSite(String userName, String password) {
		
		
		
		if(userName == "SriTeja" && password=="teja123") {
			System.out.println("Hi.....Welcome to "+userName); 
		}
		
	}
}

