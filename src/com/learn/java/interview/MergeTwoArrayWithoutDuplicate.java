package com.learn.java.interview;

import java.util.HashSet;
import java.util.Set;

public class MergeTwoArrayWithoutDuplicate {

	public static void main(String[] args) {
		int a[] = { 1, 3, 5, 7, 8, 9, 5, 4 }, b[] = { 2, 4, 6, 8 };
		mergeArrays(a, b);
	}

	public static void mergeArrays(int a[], int b[]) {
		Set<Integer> setA = new HashSet<Integer>();
		for (Integer i : a) {
			setA.add(i);
		}
		for (Integer i : b) {
			setA.add(i);
		}
		setA.forEach(p -> System.out.print(p+" "));	
	}
}
