package com.learn.java.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortArrayAndRemoveDuplicatesWithoutSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 2, 34, 6, 7, 9, 2 };
		List<Integer> list = new ArrayList<Integer>();
		for (Integer i : arr) {
			list.add(i);
		}
		HashMap<Integer, Boolean> hashMap = new HashMap<Integer, Boolean>();
		Stream<Integer> str = list.stream();
		System.out.println("filter duplicate");
		str.sorted().forEach(j -> {
			if (hashMap.get(j) == null) {
				System.out.print(j+" ");
				hashMap.put(j, true);
			}
		});

		// removeDuplcates(arr, arr.length);

		/*
		 * Stream<Integer> randomNumbers = Stream.generate(() -> (new
		 * Random()).nextInt(100));
		 * 
		 * randomNumbers.limit(20).forEach(System.out::println);
		 */

		/*
		 * IntStream instream="12345_dfaadfaa".chars();
		 * instream.forEach(p->System.out.println(p));
		 */
	}

	/*
	 * public static void removeDuplcates(int arr[], int size) { HashMap<Integer,
	 * Boolean> hashMap = new HashMap<Integer, Boolean>();
	 * Arrays.asList(arr).stream().forEach(i -> { if(hashMap.get(i==null)) {
	 * System.out.println(i[0]); hashMap.put(i[0], true); } }); }
	 */
}
