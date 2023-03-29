package com.learn.java.challenges;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		StringJoiner strj = new StringJoiner(",");
		strj.add("Kuber pujar").add("john").add("Ops").add("Java8");
		System.out.println(strj.toString());
	}

}
