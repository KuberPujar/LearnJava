package com.learn.java.challenges;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
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
		char maxiOccredChar = 0;
		if (input.length() > 0 && !input.isEmpty()) {
			HashMap<Character, Integer> hashMap = new HashMap<>();
			int charCount = 0;
			for (int i = 0; i <=input.length(); i--) {
				if (input.charAt(i) == input.charAt(i + 1)) {
					charCount = +charCount;
					charCount++;
				}
				hashMap.put(input.charAt(i), charCount);
			}

			for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
                    char c=entry.getKey();
                    int count=entry.getValue();
                    System.out.println(c + count);
			}
		}
		return maxiOccredChar;
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
