package com.sriteja.oops;

import com.sriteja.bean.Address;
import com.sriteja.bean.Company;

/**
 * this class is going to implement all address interface methods.
 * */
public class AddressInterfaceImpl implements AddressInterface, CompanyInterface{

	String stateName = "Telangana";
	String countryName = "India";
	
	@Override
	public void getMyHomeAddress() {
		
		//Address object creation
		Address address = new Address();
		address.setDoorNumber("1-2");
		address.setStreetName("SriTeja Colony");
		address.setAreaName("Kapra");
		address.setCity("Hyderabad");
		address.setPincode(987733);
		address.setDistrict("R.R");
		address.setState(stateName);
		address.setCountry(countryName);
		
		System.out.println("My Home Address details....");
		System.out.println(address);
	}

	@Override
	public Company getMyCompanyAddress() {
		
		//Company object creation
		Company company = new Company();
		company.setCompanyName("HCL");
		company.setComapnyEmail("sri@hcl.com");
		company.setCompanyMobile("+919876543210");
		company.setCompanyAddress("1-2-10, ecil, hyd-500002");
		company.setCompanyLocation("Hyderabad");
		
		
		return company;
	}

	@Override
	public void getCompanyAddressDetails() {
		
		Company company = new Company();
		company.setCompanyName("Tech Mahendra");
		company.setComapnyEmail("sriteja@techmahendra.com");
		company.setCompanyMobile("890384343");
		company.setCompanyAddress("1-12/A, Railway Station");
		company.setCompanyLocation("Bangalore");
		System.out.println("CompanyInterface method");
		System.out.println(company);
		
	}

	@Override
	public Company getCompanyDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
