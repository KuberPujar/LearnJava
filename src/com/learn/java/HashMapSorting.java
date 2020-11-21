package com.learn.java;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public class HashMapSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("one", 1);
		hashMap.put("two", 2);
		hashMap.put("seven", 7);
		hashMap.put("nine", 9);
		hashMap.put("ten", 10);

		List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(hashMap.entrySet());

		Collections.sort(list, new Comparator<Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> arg0, Entry<String, Integer> arg1) {
				return (arg0.getValue().compareTo(arg1.getValue()));
			}
		});

		for (Entry<String, Integer> e : list) {
			System.out.println(e);
		}

		Collections.sort(list, new Comparator<Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> arg0, Entry<String, Integer> arg1) {
				return (arg0.getKey().compareTo(arg1.getKey()));
			}
		});
		
		for (Entry<String, Integer> e : list) {
			System.out.println(e);
		}

	}

}
