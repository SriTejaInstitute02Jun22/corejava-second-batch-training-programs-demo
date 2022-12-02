package com.sriteja.oops;

public class DemoInterfaceImpl implements DemoInterface{

	String accountNumber = "892434342";
	String bankName = "SBI Bank";
	@Override
	public void getAccountNumber() {
		System.out.println("My Account number "+accountNumber);
	}

	@Override
	public String getBankName() {
		return bankName;
	}

}
