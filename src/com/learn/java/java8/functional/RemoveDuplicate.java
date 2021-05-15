package com.learn.java.java8.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 5, 9, 9, 3, 3, 4, 7, 7, 2);
//imperative
		List<Integer> list1 = new ArrayList<Integer>();
		for (Integer in : list) {
			if (!list.contains(in)) {
				list1.add(in);
			}
		}
	System.out.println(list1);
System.out.println("");
		// declarative
		list.stream().distinct().collect(Collectors.toList()).forEach(p -> System.out.print(p));
	}

}
