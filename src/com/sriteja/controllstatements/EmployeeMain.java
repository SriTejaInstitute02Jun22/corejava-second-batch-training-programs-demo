package com.sriteja.controllstatements;

import com.sriteja.bean.Employe;

/**
 * This class contain Employee Data.
 * **/
public class EmployeeMain {

	public static void main(String[] args) {

		Employe empResponse = setEmployeeDetails();
		Object response = getEmployeeByEmpEmailAndEmpId(empResponse);
		System.out.println("Response :: "+response);
		
	}

	/**
	 * get employee data based on empEmail and empId
	 * @return employe
	 */
	private static Object getEmployeeByEmpEmailAndEmpId(Employe empResponse) {
		
		int empId = empResponse.getEmpId();
		String empEmail = empResponse.getEmail();
		
		if(empId > 0 && empEmail != null) {
			System.out.println("Employe Id "+empId+" and Employe Email "+empEmail);
			return empResponse;
		}else {
			return "Employe Data is not available.........";
		}
		
	}
	
	
	/***
	 * Set Employe data
	 * @return employee
	 * */
	private static Employe setEmployeeDetails() {
		
		//create employee object
		Employe employee = new Employe();
		
		//set employe data
		employee.setEmpId(1233);
		employee.setEmpName("ABD");
		employee.setEmpSalary(20033.0);
		employee.setEmail("abc@gmail.com");
		//employee.setEmail(null);
		employee.setMobile(98273344);
		employee.setEmpDept("IT");
		employee.setEmpAddress("1-1/20, kd colony, Hyd.");
		return employee;
	}
}
