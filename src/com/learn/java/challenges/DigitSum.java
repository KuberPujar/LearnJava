package com.learn.java.challenges;

public class DigitSum {

	public static void main(String[] args) {
		int num = 456;
		int sum = 0;
		if (num >= 10) {
			while (num > 0) {
				int digit = num % 10;
				sum += digit;
				num /= 10;
			}
		} else {
			System.out.println("-1");
		}

		System.out.println(sum);
	}

}
