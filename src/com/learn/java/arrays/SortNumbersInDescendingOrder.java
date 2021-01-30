package com.learn.java.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortNumbersInDescendingOrder {

	public static void main(String[] args) {
		int arr[] = getIntegers(5);
		printArray(arr);
		System.out.println("\n");
		int sortedArr[] = sortIntegers(arr);
		System.out.println("\n");
		printArray(sortedArr);
	}

	public static int[] getIntegers(int number) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entered " + number + " integers");
		int[] arr = new int[number];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		return arr;
	}

	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Element "+i+ " contents "+arr[i]);
		}
	}

	public static int[] sortIntegers(int arr[]) {
		// int[] sortedArr = new int[arr.length];
		/*
		 * for (int i = 0; i < arr.length; i++) { sortedArr[i] = arr[i]; }
		 */
		int[] sortedArr = Arrays.copyOf(arr, arr.length);
		boolean flag = true;
		int temp;
		while (flag) {
			flag = false;
			for (int i = 0; i < sortedArr.length - 1; i++) {
				if (sortedArr[i] < sortedArr[i + 1]) {
					temp = sortedArr[i];
					sortedArr[i] = sortedArr[i + 1];
					sortedArr[i + 1] = temp;
					flag = true;
				}
			}
		}
		return sortedArr;
	}
}
