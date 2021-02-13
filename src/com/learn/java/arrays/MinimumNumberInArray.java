package com.learn.java.arrays;

import java.util.Scanner;

public class MinimumNumberInArray {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter count::");
		int count =readInteger();
		int arr[] = readElements(count);
		int min = findMin(arr);
		System.out.println(min);
	}

	public static int[] readElements(int number) {

		System.out.println("Entered " + number + " integers");
		int[] arr = new int[number];
		for (int i = 0; i < arr.length; i++) {
			int element = scanner.nextInt();
			scanner.nextLine();
			arr[i]=element;
		}
		return arr;
	}

	public static int readInteger() {
		int count=scanner.nextInt();
		scanner.nextLine();
		return count;
	}

	public static int findMin(int arr[]) {

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		return min;
	}
}
