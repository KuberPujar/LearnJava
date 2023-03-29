package com.learn.java.methodoverloading;

public class CalcFAndIToCentimeters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calcFeetAndInchesToCentimeters(7, 5));
		System.out.println(calcFeetAndInchesToCentimeters(12));
	}

	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		if (feet >= 0 && (inches >= 0 && inches <= 12)) {
			return ((feet * 12) * 2.54d) + (inches * 2.54d);
		} else {
			return -1;
		}
	}
	
	public static double calcFeetAndInchesToCentimeters(double inches) {
		if (inches >= 0 ) {
			return (inches * 2.54d);
		} else {
			return -1;
		}
	}
}
