package com.learn.java.methodoverloading;

public class IntEqualityPrinter {

	public static void main(String[] args) {
		printEqual(1, 1, 1);// should print text All numbers are equal

		printEqual(1, 1, 2);// should print text Neither all are equal or different

		printEqual(-1, -1, -1); // should print text Invalid Value

		printEqual(1, 2, 3);// should print text All numbers are different
	}

	public static void printEqual(int a, int b, int c) {
		if (a >= 0 && b >= 0 && c >= 0) {
			if (a == b && b == c && a == c) {
				System.out.println("All numbers are equal");
			} else if (a != b && b != c && a != c) {
				System.out.println("All numbers are different");
			} else {
				System.out.println("Neither all are equal or different");
			}
		} else {
			System.out.println("Invalid Value");
		}
	}
}
