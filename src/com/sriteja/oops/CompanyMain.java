package com.sriteja.oops;

import com.sriteja.bean.Company;

public class CompanyMain {

	//instance variable
	String myName = "Sri Teja";
	int myId =  244;
	
	public void setCompamyDetails() {
		
		//creating the Company Object
		Company company = new Company();
		
		//setter methods
		company.setCompanyName("Infosys");
		company.setComapnyEmail("infosys@gmail.com");
		company.setCompanyMobile("9876543210");
		company.setCompanyAddress("1-1,Kapra,Hyderabad");
		company.setCompanyLocation("Bangalore");
		
		System.out.println("Company Details..");
		System.out.println(company);
	}
	
	public void getCompanyNameAndEmail() {
		String companyName = "Wipro";
		String email = "sriteja@wipro.com";
		
		//creating the Company Object
		Company companyDetails = new Company();
		
		//setter methods
		companyDetails.setCompanyName(companyName);
		companyDetails.setComapnyEmail(email);
		
		System.out.println("Company Name = "+companyDetails.getCompanyName());
		System.out.println("Company Email = "+companyDetails.getComapnyEmail());
	}
	
	
}
