package com.sriteja.oops;

/**
 * same method name and same parameters in two diff classes is called overriding
 * **/
public class CSchool extends PSchool{

	public String getSchoolName(String schoolName) {
		String cSchollName = "Chaild School";
		return cSchollName;
	}
	
	public void getSchoolAddress() {
		System.out.println("Child Class ========Bangalore");
	}
}
