package com.sriteja.oops;

import com.sriteja.bean.Employe;

public interface EmployeeInterface extends CompanyInterface{


	/***
	 * get the employ data based on employ id and employ email.
	 * @param empId		- employee id
	 * @param empEmail	- employee email
	 * 
	 * @return employe	- return the employ details
	 */
	public Employe getEmployeeDetails(int empId, String empEmail);  //method creation
	
	/***
	 * get the employ department based on employ id.
	 * @param empId				- employee id
	 * 
	 * @return empDepartment	- return the employee department
	 */
	public String getEmployeeDepartment(int empId);					//method creation
}
