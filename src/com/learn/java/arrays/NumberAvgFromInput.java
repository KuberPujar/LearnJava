package com.learn.java.arrays;

import java.util.Scanner;

public class NumberAvgFromInput {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int arr[] = getIntegers(5);
		printArray(arr);
		System.out.println("\n");
		System.out.println(getAverage(arr));
	}

	public static int[] getIntegers(int number) {
		System.out.println("Entered " + number + " integers");
		int[] arr = new int[number];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		return arr;
	}

	public static double getAverage(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return ((double) sum / arr.length);
	}

	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}
