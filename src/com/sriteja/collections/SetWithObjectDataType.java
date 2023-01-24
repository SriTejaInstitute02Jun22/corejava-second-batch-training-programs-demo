package com.sriteja.collections;

import java.util.LinkedHashSet;
import java.util.Set;

import com.sriteja.bean.Employe;

public class SetWithObjectDataType {

	public static void main(String[] args) {

		Set<Object> data = getSetOfData();
		System.out.println("All Set of Data ====="+data);
		
	}

	public static Set<Object> getSetOfData() {

		Set<Object> setOfValues = new LinkedHashSet<>();

		setOfValues.add("Ram");
		setOfValues.add("Sam");
		setOfValues.add(1233);
		setOfValues.add(true);
		setOfValues.add('M');
		setOfValues.add(23242.29);
		setOfValues.add(null);
		setOfValues.add("Sam");

		// Creating the Employe object
		Employe employe = new Employe();
		employe.setEmpName("Jyothis");
		employe.setEmpId(123);
		employe.setEmpSalary(50000.0);
		employe.setEmpDept("IT");
		employe.setMobile(892727327);
		
		setOfValues.add(employe);
		
		return setOfValues;

	}
}
