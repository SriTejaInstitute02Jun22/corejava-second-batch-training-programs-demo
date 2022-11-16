package com.sriteja.oops;

import java.util.Optional;

import com.sriteja.bean.Company;
import com.sriteja.bean.Employe;

/**
 * this class is having some business logic regarding to get the employee details and company details also
 * */
public class EmployeeDetailsService implements EmployeeInterface{

	/***
	 * get the employ data based on employ id and employ email.
	 * @param empId		- employee id
	 * @param empEmail	- employee email
	 * 
	 * @return employe	- return the employ details
	 */
	@Override
	public Employe getEmployeeDetails(int empId, String empEmail) {		//method implementation or method body
		
		Employe employe = null;
		
		if(empId != 0 && !empEmail.isEmpty()) {
			//creating the Employee object
			employe = new Employe();
			employe.setEmpId(3455);
			employe.setEmpName("Pandhu");
			employe.setEmpSalary(10000.50);
			employe.setEmail("pandhu@gmail.com");
			employe.setMobile(987654321);
			employe.setEmpDept("IT");
			employe.setEmpAddress("1-1-10, Ecil, Hyd");
		}
		return employe;
	}

	/***
	 * get the employ department based on employ id.
	 * @param empId				- employee id
	 * 
	 * @return empDepartment	- return the employee department
	 */
	@Override
	public String getEmployeeDepartment(int empId) {		//method implementation or method body
		String employeDepartment = null;
		//if(Optional.ofNullable(empId).isPresent()) {		//using java 8 features
		if(empId !=0 && empId == 3452) {
			employeDepartment = "IT";
		}
		return employeDepartment;
	}

	/***
	 * get the company address details
	 */
	@Override
	public void getCompanyAddressDetails() {				//method implementation or method body
		//creating Company address details
		Company companyAddress = new Company();
		companyAddress.setCompanyAddress("1-11-10, Jai Jawan Colony, Eclil, Hyderabad");
		
		System.out.println("Compnay Address = "+companyAddress);
		
	}

	/***
	 * get the company details
	 */
	@Override
	public Company getCompanyDetails() {					//method implementation or method body
		//creating Company object
		
		return null;
	}

}
