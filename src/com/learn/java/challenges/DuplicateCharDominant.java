package com.learn.java.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DuplicateCharDominant {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			System.out.println(n);
			for (int i = 0; i < n; i++) {
				String str=scanner.next();
				System.out.println(str);
				duplicate(str);
			}
		}
	}
	public static void duplicate(String str) {
		List<Character> list = new ArrayList<>();
		if (str != null) {
			int count;

			char[] chars = str.toCharArray();
			for (int i = 0; i < chars.length; i++) {
				count = 1;
				for (int j = i + 1; j < chars.length; j++) {
					if ((chars[i] == chars[j]) && chars[i] != ' ') {
						count++;
						chars[j] = 0;
					}
				}

				if (count > 1 && chars[i] != '0') {
					list.add(chars[i]);
				}

			}
			
			
		}
		char[] cr=list.stream().map(x->(int)x).sorted().map(c->Character.toChars(c)).findFirst().get(); 
		for(char cc:cr)
		{
			System.out.println(cc);
		}
	}
}
