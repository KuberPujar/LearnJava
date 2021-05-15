package com.learn.java.challenges;

import java.util.Scanner;

public class TomAndJerryStrinCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		if (n >= 1 && n <= 2000) {
			for (int i = 0; i < n; i++) {
				String firstStr = scanner.next();
				if (firstStr.length() >= 2 && firstStr.length() <= 7) {
				        printDistinctPermutn(firstStr, "");
				}
			}
		}

	}

	static void printDistinctPermutn(String str, String ans) {

// If string is empty
		if (str.length() == 0) {

// print ans
			System.out.print(ans + " ");
			return;
		}

// Make a boolean array of size '26' which
// stores false by default and make true 
// at the position which alphabet is being
// used
		boolean alpha[] = new boolean[26];

		for (int i = 0; i < str.length(); i++) {

// ith character of str
			char ch = str.charAt(i);

// Rest of the string after excluding 
// the ith character
			String ros = str.substring(0, i) + str.substring(i + 1);

// If the character has not been used 
// then recursive call will take place. 
// Otherwise, there will be no recursive
// call
			if (alpha[ch - 'a'] == false)
				printDistinctPermutn(ros, ans + ch);
			alpha[ch - 'a'] = true;
		}
	}
}
