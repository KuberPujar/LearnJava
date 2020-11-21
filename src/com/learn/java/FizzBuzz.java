package com.learn.java;

public class FizzBuzz {

	public static void main(String[] args) {
		getFizzBuzz();
	}

	public static void getFizzBuzz() {
		for (int j = 1; j <= 50; j++) {
			if (j % (3*5) == 0) {
				System.out.println(" i:" + j + " FizzBuzz");
			}
				else if (j % 3 == 0) {
				System.out.println(" i:" + j + " Fizz");
			} else if (j % 5 == 0) {
				System.out.println(" i:" + j + " Buzz");
			}
			else
			{
				System.out.println(j);
			}
		}
	}
}
