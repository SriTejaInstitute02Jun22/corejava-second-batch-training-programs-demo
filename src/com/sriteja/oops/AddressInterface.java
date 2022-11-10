package com.sriteja.oops;

import com.sriteja.bean.Company;

/**
 * This Interface having all address details
 * 
 * Rules of Interface:
 * 1.all methods by default abstraction method 
 * 2.all variables by default public static final variables
 * 3.it cann't contain any constructor.
 * 4.we cann't create any object for the Interface.
 * 
 * Note: Java doesn't support the multiple inheritance concepts.
 * **/
public interface AddressInterface {

	public void getMyHomeAddress();	  	  //abstraction  method
	
	public Company getMyCompanyAddress();  //abstraction  method
}
