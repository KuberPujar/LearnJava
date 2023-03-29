package com.learn.java.challenges;

public class SharedDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(shareDigit(01, 02));
	}

	public static boolean shareDigit(int a, int b) {
		if (a >= 10 && a <= 99 && b >= 10 && b <= 99) {
			a /= 10;
			int righta = a % 10;
			a /= 10;
			int rightb = b % 10;
			return a == b || a == rightb || righta == b || righta == rightb;
		} else {
			return false;
		}

	}

}
