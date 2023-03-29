package com.learn.java.challenges;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isLeapYear(2024));
	}

	public static boolean isLeapYear(int year) {
		boolean isLeapYear = false;
		/*
		 * boolean isLeapYear = false; if (year >= 1 && year <= 9999) { boolean
		 * divisibleBy4 = false; boolean divisibleBy100 = false; boolean divisibleBy400
		 * = false; if (year % 4 == 0) { divisibleBy4 = true; } if (divisibleBy4 ==
		 * true) { if (year % 100 == 0) { divisibleBy100 = true; }
		 * 
		 * }
		 * 
		 * if (divisibleBy100 == true) { if (year % 400 == 0) { divisibleBy400 = true; }
		 * }
		 * 
		 * if (divisibleBy100 == true ) { isLeapYear = true; } if ( divisibleBy400 ==
		 * true) { isLeapYear = true; }
		 * 
		 * } else { isLeapYear = false; } return isLeapYear;
		 */
		if (year >= 1 && year <= 9999) {
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
				isLeapYear = true;
			}
		} else {
			isLeapYear = false;
		}
		return isLeapYear;
	}
}
