package com.learn.java.challenges;

import java.util.TreeSet;

public class TreeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> treeSet = new TreeSet<>(new MyCompare());
		treeSet.add("Sachin");
		treeSet.add("Bhajji");
		treeSet.add("Mahi");
		treeSet.add("Zahir");
		treeSet.add("Mahi");
		System.out.println(treeSet);
		{
			try {
				int a = 0;
				int b = 5;
				int c = a / b;
				System.out.println("Hello");
			} catch (Exception e) {
				System.out.println("World");
			}
		}
	}
}
