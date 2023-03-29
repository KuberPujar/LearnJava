package com.learn.java.datatypeconvers;

import java.util.ArrayList;
import java.util.List;

public class UnboxingExample {

	public static void main(String[] args) {
		Integer i = new Integer(100);
		unBox(i);// unboxing
		int j = i;// unboxing
		List list = new ArrayList<>();
		list.add(i);// unboxing
	}

	public static void unBox(int n) {
		System.out.println(n);
	}

}
