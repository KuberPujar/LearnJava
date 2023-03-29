package com.learn.java.challenges;

/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;

public class CandidateCode {
	public static void main(String args[]) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < n; i++) {
			String str = scanner.nextLine();
			System.out.println(value(str));
		}

	}

	public static int value(String str) {
		List<Integer> list = new ArrayList<>();
		if (str != null) {
			String[] strs = str.split(" ");
			int n = Integer.parseInt(strs[0]);
			int c1 = Integer.parseInt(strs[1]);
			int c2 = Integer.parseInt(strs[2]);
			if (n >= 1 && n <= 100000 && c1 >= 1 && c1 <= 100000 && c2 >= 1 && c2 <= 100000) {
				int v = n;
				for (int i = 0; i <= n; i++) {
					int value = (c1 * (i * i)) + (c2 * (v * v));
					list.add(value);
					v--;
				}
			}
		}
		return list.stream().sorted().findFirst().get();
	}
}
