package com.learn.java.controlstatements;

public class PrimeNumberCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 10; i <= 50; i++) {
			if (isPrime(i) == true) {
				System.out.println("Prime number::" + i);
				count = +count;
				count++;
			}

			if (count == 3) {
				break;
			}

		}
		System.out.println(count);
	}

	public static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}

		/*
		 * for (int i = 2; i <= n / 2; i++) { if (n % i == 0) { return false; } }
		 */
		for (int i = 2; i <(long)Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
