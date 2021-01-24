package com.learn.java.challenges;

public class LastDigitChecker {

	public static void main(String[] args) {
		System.out.println(hasSameLastDigit(41, 22, 71));// should return true since 1 is the rightmost digit in numbers
															// 41 and 71

		System.out.println(hasSameLastDigit(23, 34, 42));// should return true since 2 is the rightmost digit in numbers
															// 32 and 42

		System.out.println(hasSameLastDigit(9, 99, 999));// should return false since 9 is not within the range of
															// 10-1000

	}

	public static boolean hasSameLastDigit(int a, int b, int c) {
		boolean flag = false;
		if (isValid(a) && isValid(b) && isValid(c)) {
			int lefta = a / 10;
			int righta = a % 10;
			int leftb = b / 10;
			int rightb = b % 10;
			int leftc = c / 10;
			int rightc = c % 10;

			if ((righta == rightb)  ||( rightb == rightc) || (rightc==righta)) {
				flag = true;
			}

		}
		return flag;
	}

	public static boolean isValid(int a) {
		if (a >= 10 && a <= 1000) {
			return true;
		} else {
			return false;
		}
	}
}
