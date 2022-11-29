package com.sriteja.oops;

public class ChaildCollage extends Collage{

	@Override
	public void collageDetails() {
		System.out.println("Chaild Collage Name = CRB");
	}
	
	public static void main(String args[]) {
		
		ChaildCollage chaildCollage = new ChaildCollage();
		chaildCollage.collageDetails();
		
		Collage collage = new ChaildCollage();
		collage.collageDetails();
	}
}
