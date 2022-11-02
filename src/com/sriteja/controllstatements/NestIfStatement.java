package com.sriteja.controllstatements;

import com.sriteja.bean.Employe;

public class NestIfStatement {

	public static void main(String[] args) {
		
		Employe emp = new NestIfStatement().getEmployee(); //method calling
		
		new NestIfStatement().displayEmployeDetails(emp); //method calling
		
		//NestIfStatement nestIfStatement = new NestIfStatement();
		//nestIfStatement.displayEmployeDetails(emp);
		

		
	}
	
	/**
	 * display the employee details
	 *  
	 * */
	private void displayEmployeDetails(Employe emp) {
		
		//need to check the Employe details using nested if statements
		if(emp!=null) {
			System.out.println("Employe :: "+emp);
			//below if conditions is called inner loop
			if(emp.getEmpSalary()>=20000) {
				System.out.println("Employe Salary = "+emp.getEmpSalary());
				System.out.println("Employe Email = "+emp.getEmail());
			}else {
				System.out.println("Employe Salary less than 20000..");
			}
		}else {
			System.out.println("Employe Object is null..............");
		}
	}
	
	/**
	 * get employee details
	 * @return employe
	 * */
	public Employe getEmployee() {
		//create the Employee object
		Employe employe  = null;
	/*	employe.setEmpId(134);
		employe.setEmpName("Hari");
		//employe.setEmpSalary(5400.01);
		employe.setEmpSalary(55000.01);
		employe.setEmail("hari@gmail.com");
		employe.setMobile(987334);
		employe.setEmpDept("Admin");
		employe.setEmpAddress("L.B Nagar, 2-1-20");
	*/	
		return employe;
	}

}
