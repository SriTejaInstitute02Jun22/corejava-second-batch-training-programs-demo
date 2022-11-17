package com.sriteja.oops;

import com.sriteja.bean.Company;
import com.sriteja.bean.Employe;

/**
 * this class is displaying employe data and company details.
 * */
public class EmployeDetailsMain {

	public static void main(String[] args) {
		
		int empId = 3452;
		String empEmail = "sriteja@gmail.com";
		
		//creating the EmployeeInterface object with EmployeeDetailsService implementation class
		EmployeeInterface employeeInterface = new EmployeeDetailsService();
		System.out.println();
		/**
		 * get the Employee Details based on empId and empEmail
		 * @param empId		- employee id
		 * @param empEmail 	- employee email id
		 * @return employee	- employee object is return
		 * */
		Employe employee = employeeInterface.getEmployeeDetails(empId, empEmail);	//method calling
		System.out.println("Employe Details-------------> "+employee);
		
		System.out.println();
		/**
		 * get Employee Department based on empId
		 * @param empId		- employee id
		 * */
		String employeeDepartment = employeeInterface.getEmployeeDepartment(empId);	//method calling
		System.out.println("Employee Department = "+employeeDepartment);
		
		System.out.println();
		/**
		 * get Company Address Details
		 * */
		employeeInterface.getCompanyAddressDetails();	//method calling
		
		System.out.println();
		/**
		 * get the Company Details
		 * @return company	- company object is return
		 * */
		Company company = employeeInterface.getCompanyDetails();
		System.out.println("Compay Details ----------> "+company);
	}

}
