package com.learn.java.arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 5, 8, 3, 79, 45 };
		reverse(arr);
	}

	private static void reverse(int arr[]) {
		System.out.println("Array " + Arrays.toString(arr));
		int maxIndex = arr.length - 1;
		int halfIndx = arr.length / 2;

		for (int i = 0; i <= halfIndx; i++) {
			int temp = arr[i];
			arr[i] = arr[maxIndex-i];
			arr[maxIndex-i] = temp;
		}
		System.out.println("Array " + Arrays.toString(arr));
	}
}
