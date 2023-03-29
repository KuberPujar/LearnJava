package com.learn.java.challenges;

public class PerfectNumber {

	public static void main(String[] args) {
		System.out.println(isPerfectNumber(6));// should return true since its proper divisors are 1, 2, 3 and the sum
												// is 1 + 2 + 3 = 6

		System.out.println(isPerfectNumber(28));// should return true since its proper divisors are 1, 2, 4, 7, 14 and
												// the sum is 1 + 2 + 4 + 7 + 14 = 28

		System.out.println(isPerfectNumber(5));// should return false since its only proper divisor is 1 and the sum is
												// 1 not 5

		System.out.println(isPerfectNumber(-1));// should return false since the number is < 1
	}

	public static boolean isPerfectNumber(int n) {
		boolean flag = false;
		if (n < 1) {
			flag = false;
		} else {
			int sum = 0;
			for (int i = 1; i < n; i++) {
				if (n % i == 0) {
					sum += i;
				}
			}
			if (sum == n) {
				flag = true;
			}
		}
		return flag;
	}
}
