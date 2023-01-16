package com.sriteaj.exceptions;

public class CollageDetailsMain {

	public static void main(String[] args) {
		

		//String myCollegeName = "Dr.B.R Ambedkar College";
		
		String myCollegeName = "OU College";
		
		try {
			String collegeName = getMyCollegeName(myCollegeName);
			System.out.println("My Collage Name is ============"+collegeName);
		}catch(CollegeDetailsException cde) {
			System.out.println(cde);
		}
		
		
	}
	
	public static String getMyCollegeName(String myCollegeName) throws CollegeDetailsException{
		
		if(myCollegeName != null && myCollegeName.equals("Dr.B.R Ambedkar Collage")) {
			
			return myCollegeName;
		}else {
			throw new CollegeDetailsException("Your College name is not available");
		}
		
	}

}
