package com.sriteja.collections;

import java.util.ArrayList;
import java.util.List;

import com.sriteja.bean.Company;

public class ListOfCompnayDetailsMain {

	public static void main(String[] args) {
		
		List<Company> companyLists = getCompanyDetails();
		System.out.println("List Of Companies======"+companyLists);
		
		System.out.println();
		System.out.println("=========using Object data type into list object==========");

		List<Object> getAllTypeDetails = getAllDetails();
		System.out.println("Get All Types of Details ========"+getAllTypeDetails);
	}
	
	public static List<Company> getCompanyDetails(){
		
		//creating the list object with company details
		List<Company> listOfCompanies = new ArrayList<Company>();
		
		//google company object creation
		Company google = new Company();
		google.setCompanyName("Google");
		google.setComapnyEmail("google@gmail.com");
		google.setCompanyMobile("+919343432424");
		google.setCompanyAddress("Hyderabad");
		google.setCompanyLocation("India");
		
		//microsoft company object creation
		Company microsoft = new Company();
		microsoft.setCompanyName("Microsoft");
		microsoft.setComapnyEmail("microsoft@gmail.com");
		microsoft.setCompanyMobile("+918734343433");
		microsoft.setCompanyAddress("Bangalore");
		microsoft.setCompanyLocation("India");
		
		//ibm company object creation
		Company ibm = new Company();
		ibm.setCompanyName("IBM");
		ibm.setComapnyEmail("ibm@gmail.com");
		ibm.setCompanyMobile("+91999334333");
		ibm.setCompanyAddress("Chennai");
		ibm.setCompanyLocation("India");
		
		//add the company details into list object
		listOfCompanies.add(google);
		listOfCompanies.add(microsoft);
		listOfCompanies.add(ibm);
		
		return listOfCompanies;
		
	}

	
	public static List<Object> getAllDetails(){
		
		//creating the list object
		List<Object> allDetails = new ArrayList<>();
		
		allDetails.add(130);
		allDetails.add("Ramesh Babu");
		allDetails.add(true);
		allDetails.add('G');
		allDetails.add(null);
		
		
		//microsoft company object creation
		Company microsoft = new Company();
		microsoft.setCompanyName("Microsoft");
		microsoft.setComapnyEmail("microsoft@gmail.com");
		microsoft.setCompanyMobile("+918734343433");
		microsoft.setCompanyAddress("Bangalore");
		microsoft.setCompanyLocation("India");
		
		allDetails.add(microsoft);
		
		return allDetails;
	}
	
}
