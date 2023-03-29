package com.learn.java.controlstatements;

public class InterestCalculate {

	public static void main(String[] args) {
		for (int i = 2; i <= 8; i++) {
			System.out.println(String.format("%.2f", calculateInterest(10000, i)));
		}
		
		for (int i = 8; i >= 2; i--) {
			System.out.println(String.format("%.2f", calculateInterest(10000, i)));
		}
	}

	public static double calculateInterest(double amount, double interest) {
		return (amount * (interest / 100));
	}
}
