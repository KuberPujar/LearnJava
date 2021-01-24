package com.learn.java.challenges;

public class LargestPrime {

	public static void main(String[] args) {
		System.out.println(getLargestPrime(64));
		System.out.println(getLargestPrime(21));// should return 7 since 7 is the largest prime (3 * 7 = 21)

		System.out.println(getLargestPrime(217));// should return 31 since 31 is the largest prime (7 * 31 = 217)

		System.out.println(getLargestPrime(0));// should return -1 since 0 does not have any prime numbers

		System.out.println(getLargestPrime(45));// should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)

		System.out.println(getLargestPrime(-1));/// should return -1 since the parameter is negative
	}

	public static int getLargestPrime(int n) {
		int maxPrime = -1;
		if (n > 0) {
			while (n % 2 == 0) {
				maxPrime = 2;
				n >>= 1;
			}
			for (int i = 3; i <= (long) Math.sqrt(n); i += 2) {
				while (n % i == 0) {
					maxPrime = i;
					n /= i;
				}
			}

			if (n > 2) {
				maxPrime = n;
			}
		}

		return maxPrime;
	}
}
