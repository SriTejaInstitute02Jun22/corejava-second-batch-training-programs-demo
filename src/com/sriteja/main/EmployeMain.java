package com.sriteja.main;

import com.sriteja.bean.Employe;

public class EmployeMain {

	//creating the main method
	public static void main(String args[]) {
		/*EmployeMain employeMain = new EmployeMain(); 
		employeMain.setEmployeDetails();*/
		
		new EmployeMain().setEmployeDetails();
	}
	
	//instance method or non static method
	private void setEmployeDetails() {
		
		//creating the employe object
		Employe employe = new Employe();
		//setter methods 
		employe.setEmpId(8922);
		employe.setEmpName("Pandu");
		employe.setEmpSalary(8393.10);
		employe.setEmail("pandu@gmail.com");
		employe.setMobile(6826727);
		employe.setEmpDept("IT");
		employe.setEmpAddress("7-30D Kadiri, A.P");
		
		System.out.println("Employe Details :: "+employe);
		System.out.println();
		
		//getter methods
		System.out.println("Employe Name :: "+employe.getEmpName());
		System.out.println("Employe Email Id :: "+employe.getEmail());
		System.out.println();
		
		System.out.println("Employee email = "+employe.getEmail()+" Employe Mobile = "+employe.getMobile());
		
		
	}
}
