package com.sriteja.bean;

public class EmployDetails {

	//attributes
	private String empName;
	private String empDesignation;
	private String empId;
	private String empCompanyName;
	private int empContactNumber;
	private String empBlodGroup;
	private String empEmailId;
	private String empDepartment;
	private String empAddress;
	private char empGender;
	private float empSalary;
	private double empYearlyPackage;
	private  boolean empComapanyLaptop;
	
	//setter and getter methods
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpCompanyName() {
		return empCompanyName;
	}
	public void setEmpCompanyName(String empCompanyName) {
		this.empCompanyName = empCompanyName;
	}
	public int getEmpContactNumber() {
		return empContactNumber;
	}
	public void setEmpContactNumber(int empContactNumber) {
		this.empContactNumber = empContactNumber;
	}
	public String getEmpBlodGroup() {
		return empBlodGroup;
	}
	public void setEmpBlodGroup(String empBlodGroup) {
		this.empBlodGroup = empBlodGroup;
	}
	public String getEmpEmailId() {
		return empEmailId;
	}
	public void setEmpEmailId(String empEmailId) {
		this.empEmailId = empEmailId;
	}
	public String getEmpDepartment() {
		return empDepartment;
	}
	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public char getEmpGender() {
		return empGender;
	}
	public void setEmpGender(char empGender) {
		this.empGender = empGender;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	public double getEmpYearlyPackage() {
		return empYearlyPackage;
	}
	public void setEmpYearlyPackage(double empYearlyPackage) {
		this.empYearlyPackage = empYearlyPackage;
	}
	public boolean isEmpComapanyLaptop() {
		return empComapanyLaptop;
	}
	public void setEmpComapanyLaptop(boolean empComapanyLaptop) {
		this.empComapanyLaptop = empComapanyLaptop;
	}
	
	//toString() method
	@Override
	public String toString() {
		return "EmployDetails [empName=" + empName + ", empDesignation=" + empDesignation + ", empId=" + empId
				+ ", empCompanyName=" + empCompanyName + ", empContactNumber=" + empContactNumber + ", empBlodGroup="
				+ empBlodGroup + ", empEmailId=" + empEmailId + ", empDepartment=" + empDepartment + ", empAddress="
				+ empAddress + ", empGender=" + empGender + ", empSalary=" + empSalary + ", empYearlyPackage="
				+ empYearlyPackage + ", empComapanyLaptop=" + empComapanyLaptop + "]";
	}
	
	
	
}
