package com.learn.java.challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
//int array,int k---
	// {-5,7,50,15,3} k=10
	public static void main(String[] args) {
		int arr[] = { -5, 7, 50, 15, 3 };
		int k = 10;
		try {
			System.out.println(getPairs(arr, k));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Map<Integer, List<Integer>> getPairs(int[] arr, int k) throws Exception {
		Map<Integer, List<Integer>> map=new HashMap<>();
		
		int count=0;
		if (arr.length > 0 && k >= 0) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = i; j < arr.length; j++) {
					if ((arr[i] + arr[j]) == k) {
						List<Integer> list=new ArrayList<>();
						list.add(arr[i]);
						list.add(arr[j]);
						map.put(count,list);
						count++;
					}
				}

			}

		} else {
			throw new Exception("parameters not supported");
		}
		return map;
	}
}
