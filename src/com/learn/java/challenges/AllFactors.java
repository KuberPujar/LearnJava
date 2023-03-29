package com.learn.java.challenges;

public class AllFactors {

	public static void main(String[] args) {

		printFactors(74);
	}

	public static void printFactors(int n) {
		if (n < 1) {
			System.out.println("Invalid Value");
		} else {
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					System.out.println(i);
				}
			}
		}
	}
}
