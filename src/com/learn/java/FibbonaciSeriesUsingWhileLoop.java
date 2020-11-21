package com.learn.java;

public class FibbonaciSeriesUsingWhileLoop {

	public static void main(String[] args) {
		int i = 10, n1 = 0, n2 = 1, sum = 0, j = 1;
		while (j <= i) {
			System.out.print(n1 + " + ");
			sum = n1 + n2;
			n1 = n2;
			n2 = sum;
			j++;
		}
	}

}
