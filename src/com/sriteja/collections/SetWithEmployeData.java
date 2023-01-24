package com.sriteja.collections;

import java.util.HashSet;
import java.util.Set;

import com.sriteja.bean.Employe;

public class SetWithEmployeData {

	public static void main(String[] args) {

		Set<Employe> employeDetails = getEmployeDetails();
		System.out.println("Employee Details "+employeDetails);
	}

	public static Set<Employe> getEmployeDetails(){
		
		//creating the Set objec using Employe Custom Object
		Set<Employe> setOfEmployeDetails = new HashSet<Employe>();
		
		
		//Creating the employe object 
		Employe emp1 = new Employe();
		emp1.setEmpName("Jyothis");
		emp1.setEmpId(123);
		emp1.setEmpSalary(50000.0);
		emp1.setEmpDept("IT");
		emp1.setMobile(892727327);
		
		Employe emp2 = new Employe();
		emp2.setEmpName("Anil");
		emp2.setEmpId(145);
		emp2.setEmpSalary(55000.0);
		emp2.setEmpDept("IT");
		emp2.setMobile(6727272);
		
		Employe emp3 = new Employe();
		emp3.setEmpName("Dhileep");
		emp3.setEmpId(155);
		emp3.setEmpSalary(50000.0);
		emp3.setEmpDept("Admin");
		emp3.setMobile(78222222);
		
		setOfEmployeDetails.add(emp1);
		setOfEmployeDetails.add(emp2);
		setOfEmployeDetails.add(emp3);
		setOfEmployeDetails.add(emp1);
		
		return setOfEmployeDetails;
		
	}
}
