package com.sriteja.controllstatements;

public class BreakAndContinueDemo {

	public static void main(String[] args) {

		int i = 5;
		int j = 10;
		new BreakAndContinueDemo().display(i, j);
		new BreakAndContinueDemo().show(i, j);
	}

	public void display(int i, int j) {

		// for loop
		for (int k = i; k < j; k++) {
			System.out.println("K = " + k + " J = " + j);
			if (k == 7) {
				System.out.println("K=" + k);
				break;
			}
			System.out.println(".......");
		}
		System.out.println("=============");
		System.out.println("J = " + j + " I = " + i);

	}

	public void show(int i, int j) {
		System.out.println();
		System.out.println();
		// for loop
		for (int k = i; k < j; k++) {
			System.out.println("K = " + k + " J = " + j);
			if (k == 7) {
				System.out.println("K=" + k);
				continue;
			}
			System.out.println(".......");
		}
		System.out.println("=============");
		System.out.println("J = " + j + " I = " + i);

	}

}
