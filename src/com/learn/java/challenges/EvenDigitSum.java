package com.learn.java.challenges;

public class EvenDigitSum {

	public static void main(String[] args) {
		System.out.println(getEvenDigitSum(688));
		System.out.println(getEvenDigitSum(123456789));// should return 20 since 2 + 4 + 6 + 8 = 20
        System.out.println(getEvenDigitSum(252));// should return 4 since 2 + 2 = 4
        System.out.println(getEvenDigitSum(-22));// should return -1 since the number is negative
	}

	public static int getEvenDigitSum(int number) {
		int sum = 0, n = 0;
		if (number >= 0) {
			while (number > 0) {
				n = number % 10;
				number /= 10;
				if (n % 2 == 0) {
					sum += n;
				}
			}
			return sum;
		} else {
			return -1;
		}

	}
}
