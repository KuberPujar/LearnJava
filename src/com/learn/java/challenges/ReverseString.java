package com.learn.java.challenges;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Kuber";
		char[] chars = str.toCharArray();
		StringBuilder strb = new StringBuilder();
		for (int i = chars.length - 1; i >= 0; i--) {
			strb.append(chars[i]);
		}
		System.out.println(strb.toString());

		StringBuilder strb1 = new StringBuilder("nayan");
		System.out.println(strb1.reverse().toString());
	}

}
