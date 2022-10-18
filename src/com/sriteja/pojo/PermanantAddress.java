package com.sriteja.pojo;

public class PermanantAddress {

	//attributes
	private String houseNumber;
	private String area;
	private String villageName;
	private String mandal;
	private String post;
	private int pincode;
	private String state;
	private String district;
	
	//no argument constructor
	public PermanantAddress() {
		
	}

	//setter and getter methods
	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getVillageName() {
		return villageName;
	}

	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}

	public String getMandal() {
		return mandal;
	}

	public void setMandal(String mandal) {
		this.mandal = mandal;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	//toString() method
	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", area=" + area + ", villageName=" + villageName + ", mandal="
				+ mandal + ", post=" + post + ", pincode=" + pincode + ", state=" + state + ", district=" + district
				+ "]";
	}
	
	
	
}
