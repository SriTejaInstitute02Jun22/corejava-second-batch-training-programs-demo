package com.sriteja.bean;

public class Company {

	//attributes or variable
	private String companyName;
	private String comapnyEmail;
	private String companyMobile;
	private String companyAddress;
	private String companyLocation;
	
	//setter and getter methods
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getComapnyEmail() {
		return comapnyEmail;
	}
	public void setComapnyEmail(String comapnyEmail) {
		this.comapnyEmail = comapnyEmail;
	}
	public String getCompanyMobile() {
		return companyMobile;
	}
	public void setCompanyMobile(String companyMobile) {
		this.companyMobile = companyMobile;
	}
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	public String getCompanyLocation() {
		return companyLocation;
	}
	public void setCompanyLocation(String companyLocation) {
		this.companyLocation = companyLocation;
	}
	
	//toString() method
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", comapnyEmail=" + comapnyEmail + ", companyMobile="
				+ companyMobile + ", companyAddress=" + companyAddress + ", companyLocation=" + companyLocation + "]";
	}
	
	
}
