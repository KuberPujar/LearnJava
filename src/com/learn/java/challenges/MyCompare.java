package com.learn.java.challenges;

import java.util.Comparator;

public class MyCompare implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1=o1.toString();
		String s2=o2.toString();
		return +s1.compareTo(s2);
	}

}
