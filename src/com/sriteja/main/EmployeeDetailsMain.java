package com.sriteja.main;

import java.util.Optional;

import com.sriteja.bean.Employe;
import com.sriteja.pojo.PermanantAddress;

public class EmployeeDetailsMain {

	public static void main(String[] args) {

		//set employee details and return the same employee details in the response.
		Employe employe = setEmployeeData(); //method calling
		
		//get the employee details based on Post and  District.
		Object response = getEmployeeByPostAndDist(employe);
		System.out.println("Response =============="+response);
	}

	private static Object getEmployeeByPostAndDist(Employe employe) {

		//PermanentAddress should be present.
		if(Optional.ofNullable(employe.getPermanantAddress()).isPresent()) {
			System.out.println("Employe Permanant Address Details = "+employe.getPermanantAddress());
			
			//Post and District should be present 
			if(Optional.ofNullable(employe.getPermanantAddress().getPost()).isPresent() && 
					Optional.ofNullable(employe.getPermanantAddress().getDistrict()).isPresent()) {
				
				String post = employe.getPermanantAddress().getPost();
				String district = employe.getPermanantAddress().getDistrict();
				
				System.out.println("Post = "+post);
				System.out.println("District = "+district);
				
				return employe;
				
			}else {
				return "Post or District details not available into "+employe.getEmpName();
			}
			
		}else {
			
			return "Permanant Address not available to this Employe Object............Employee Name = "+employe.getEmpName();
		}
		
	}

	/**
	 * set employee data
	 * @return employee
	 * */
	private static Employe setEmployeeData() {
		
		//create Employee data
		Employe employe = new Employe();
		//set values to Employee object
		employe.setEmpId(9822);
		employe.setEmpName("Varun");
		employe.setEmpSalary(25000.10);
		employe.setEmail("varun@gmail.com");
		employe.setMobile(9032934);
		employe.setEmpDept("IT");
		employe.setEmpAddress("12-10/1, L.B.Nagar, HYD-500003");
		
		//create the PermanantAddress object
		PermanantAddress permanantAddress = new PermanantAddress();
		permanantAddress.setHouseNumber("10-20/1");
		permanantAddress.setArea("Kadiri");
		permanantAddress.setVillageName("Kokkanti Cross");
		permanantAddress.setMandal("Thavalam");
		permanantAddress.setPost("Tanakallu");
		permanantAddress.setPincode(515571);
		permanantAddress.setState("A.P");
		permanantAddress.setDistrict("Ananthapuram"); 
		
		employe.setPermanantAddress(permanantAddress);
		
		return employe;
	}

}
