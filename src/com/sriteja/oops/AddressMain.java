package com.sriteja.oops;

import com.sriteja.bean.Company;

public class AddressMain {

	public static void main(String[] args) {

		//creating the object for AddressInterfaceImpl 
		AddressInterface addressDetils = new AddressInterfaceImpl();	//object creating for interface indirectly.
		addressDetils.getMyHomeAddress();
		System.out.println();
		System.out.println();
		
		Company companyAddress = addressDetils.getMyCompanyAddress();
		System.out.println("Company Address = "+companyAddress);
		
		System.out.println();
		System.out.println("================================");
		//Object creation for CompanyInterface
		CompanyInterface companyInterface = new AddressInterfaceImpl(); //object creating for interface indirectly.
		companyInterface.getCompanyAddressDetails();
	}

}
