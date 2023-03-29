package com.learn.java.challenges;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getGreatestCommonDivisor(30, 12));
	}

	public static int getGreatestCommonDivisor(int n1, int n2) {

		if (n1 >= 10 && n2 >= 10) {
			int gcd = 1;
			for (int i = 1; i <= n1 && i <= n2; i++) {
				if (n1 % i == 0 && n2 % i == 0) {
					gcd = i;
				}
			}
			return gcd;
		} else {
			return -1;
		}
	}
}
