package com.sriteja.bean;

import com.sriteja.pojo.PermanantAddress;

/**
 *  Employee bean class, it contain employee details
 * **/
public class Employe {

	//attributes
	private int empId;
	private String empName;
	private double empSalary;
	private String email;
	private int mobile;
	private String empDept;
	private String empAddress;
	
	//adding Address details 
	private PermanantAddress permanantAddress;
	
	//no argument constructor
	public Employe() {
		
	}

	//setter and getter methods
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public PermanantAddress getPermanantAddress() {
		return permanantAddress;
	}

	public void setPermanantAddress(PermanantAddress permanantAddress) {
		this.permanantAddress = permanantAddress;
	}

	//toString() method
	@Override
	public String toString() {
		return "Employe [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", email=" + email
				+ ", mobile=" + mobile + ", empDept=" + empDept + ", empAddress=" + empAddress + ", permanantAddress="
				+ permanantAddress + "]";
	}
	
	
	
	
}
