package com.learn.java.datatypeconvers;

import java.util.LinkedList;
import java.util.List;

public class AutoBoxingEx {

	public static void main(String[] args) {
		int i = 200;
		//when assigning values to wrapper classes
		Integer j=200;//autoboxing
		Long lnum=200L;//autoboxing
		
		//when passing values to method
		myInt(i);
		List<Integer> list=new LinkedList<>();
		list.add(1);//autoboxing
	}

	public static void myInt(Integer n) {
		System.out.println(n);
	}

}
