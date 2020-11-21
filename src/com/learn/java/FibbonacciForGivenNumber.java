package com.learn.java;

abstract class FibbonacciForGivenNumber {

	
	public static void main(String[] args) {
		getFiboSeries(30);
	}

	private static void getFiboSeries(int num) {
		long n1 = 0, n2 = 1, sum = 0;
		for (int j = 1; j <= num; j++) {
			System.out.print(n1 + " + ");
			sum = n1 + n2;
			n1 = n2;
			n2 = sum;
		}
	}
}
