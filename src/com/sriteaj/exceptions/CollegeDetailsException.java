package com.sriteaj.exceptions;

/**
 * this class is using to show the some custom exception details.
 * this class is handling business logic exceptions related College 
 * **/
public class CollegeDetailsException extends Exception{

	public CollegeDetailsException(String errorMessage) {
		super(errorMessage);
	}
}
