package com.learn.java.challenges;

public class NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(323));
	}

	public static boolean isPalindrome(int number) {

		int reverse = 0;
		int originalNum = number;
		while (number > 0 || number < 0) {
			int lastDigit = number % 10;
			reverse = reverse * 10;
			reverse += lastDigit;
			number /= 10;
		}

		if (originalNum == reverse) {
			return true;
		} else {
			return false;
		}
	}
}
