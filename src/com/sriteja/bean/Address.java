package com.sriteja.bean;

public class Address {

	//attributes
	private String doorNumber;
	private String streetName;
	private String areaName;
	private String city;
	private int pincode;
	private String district;
	private String state;
	private String country;
	
	//setter and getter methods
	public String getDoorNumber() {
		return doorNumber;
	}
	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	//toString() method
	@Override
	public String toString() {
		return "Address [doorNumber=" + doorNumber + ", streetName=" + streetName + ", areaName=" + areaName + ", city="
				+ city + ", pincode=" + pincode + ", district=" + district + ", state=" + state + ", country=" + country
				+ "]";
	}
	
	
	
}
