package com.learn.java.interview;

public class SwappingNumbersWithoutThirdVariable {

	public static void main(String[] args) {
		swap(5,100);
	}

	public static void swap(int a, int b) {
		System.out.println("Before swapping variables:");
		System.out.println("a:" + a + " b:" + b);
		a = a + b;
		b = a - b;
	    a = a - b;
		System.out.println("After swapping variables:");
		System.out.println("a:" + a + " b:" + b);
	}
}
