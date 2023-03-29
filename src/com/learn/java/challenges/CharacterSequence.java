package com.learn.java.challenges;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

	/*
	 * Complete the 'getMaxOccuredChar' function below.
	 *
	 * The function is expected to return a CHARACTER. The function accepts STRING
	 * input as parameter.
	 */

	public static char getMaxOccuredChar(String input) {
		input = input.toLowerCase();
		final int MAX = 256;
		int count[] = new int[MAX];
		Map<Character, Integer> hashMap = new LinkedHashMap<>();
		int len = input.length();
		for (int i = 0; i < len; i++)
			count[input.charAt(i)]++;

		char ch[] = new char[input.length()];
		for (int i = 0; i < len; i++) {
			ch[i] = input.charAt(i);
			int find = 0;
			for (int j = 0; j <= i; j++) {

				if (input.charAt(i) == ch[j])
					find++;
			}

			if (find == 1)
				if (hashMap.containsKey(input.charAt(i))) {
					hashMap.put(input.charAt(i), hashMap.get(input.charAt(i)));
				} else {
					hashMap.put(input.charAt(i), count[input.charAt(i)]);
				}
		}
		char result = ' ';
		char c = hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).findFirst()
				.get().getKey();
		char[] cc = input.toCharArray();
		for (char j : cc) {
			if (j == c) {
				result = c;
			}
		}

		return result;
	}

}

public class CharacterSequence {
	public static void main(String[] args) throws IOException {
		Scanner readInput = new Scanner(System.in);
		String inputString = readInput.nextLine();
		char result = Result.getMaxOccuredChar(inputString);
		System.out.println(result);
	}
}
