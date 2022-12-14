package com.sriteja.oops;

import com.sriteja.bean.Company;

/**
 * crating the interface
 * 
 * interface can contain only abstract methods.
 * interface having all public static and final variables.
 * interface doesn't have any constructor.
 * directly we cann't create the object for the interface.
 * but using implementation class we can create the object for this interface.
 *
 * **/
public interface CompanyInterface {

	/***
	 * get the company address details
	 */
	public void getCompanyAddressDetails();
	
	/***
	 * get the company details
	 */
	public Company getCompanyDetails();
	
}
