package com.lean.java.series;

public class Series {
	public static long nSum(int n) {
		return (n * (n - 1)/2);
	}

	public static long factorial(int n) {
		long f = 1;
		if (n == 0) {
			return 0;
		}

			for (int i = 1; i <= n; i++) {
				f = f * i;
			}
		return f;
	}

	public static long fibonacci(int n) {
		long n1 = 0, n2 = 1, sum = 0;
		for (int i = 1; i < n; i++) {
			sum = n1 + n2;
			n2 = n1;
			n1 = sum;
		}
		return n1;
	}
}
