package com.learn.java.challenges;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordGen {
	public static void main(String[] args) {

		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = in.nextInt();
		for (int i = 1; i <= t; ++i) {
			finalPass(in.next());
		}

	}

	public static void finalPass(String password) {
		String symbol = "&*@#";
		String cap_letter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String small_letter = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#*&])(?=\\S+$).{7,10000}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(password);
		if (m.matches()) {
			System.out.println("valid password");
		} else {
			if (password.length() >= 7 && isNumericPass(password)) {
				Map<String, Integer> map = new HashMap<>();
				map.put(symbol, 1);
				map.put(small_letter, 1);
				map.put(cap_letter, 1);
				System.out.println(getPass(password, map));
			} else if (password.length() == 1 && isAlphabet(password)) {
				Map<String, Integer> map = new HashMap<>();
				map.put(symbol, 1);
				map.put(small_letter, 2);
				map.put(cap_letter, 2);
				map.put(numbers, 1);
				System.out.println(getPass(password, map));
			} else if (password.length() == 1 && isNumericPass(password)) {
				Map<String, Integer> map = new HashMap<>();
				map.put(symbol, 1);
				map.put(small_letter, 1);
				map.put(cap_letter, 1);
				map.put(numbers, 4);
				System.out.println(getPass(password, map));
			}
		}
	}

	public static char[] getRandomChars(String str, int len) {
		Random random = new Random();
		char[] password = new char[len];

		for (int i = 0; i < len; i++) {
			password[i] = str.charAt(random.nextInt(str.length()));

		}
		return password;
	}

	public static boolean isNumericPass(String str) {
		boolean flag = false;
		char[] charArr = str.toCharArray();
		for (char c : charArr) {
			if (Character.isDigit(c)) {
				flag = true;
			}
		}
		return flag;
	}

	public static boolean isAlphabet(String str) {
		boolean flag = false;
		char[] charArr = str.toCharArray();
		for (char c : charArr) {
			if (Character.isAlphabetic(c)) {
				flag = true;
			}
		}
		return flag;
	}

	public static boolean isDigitNum(String str) {
		boolean flag = false;
		char[] charArr = str.toCharArray();
		for (char c : charArr) {
			if (Character.isLetterOrDigit(c)) {
				flag = true;
			}
		}
		return flag;
	}

	public static String getPass(String pass, Map<String, Integer> map) {
		StringBuilder builder = new StringBuilder(pass);

		for (Entry<String, Integer> s : map.entrySet()) {
			builder.append(getRandomChars(s.getKey(), s.getValue()));
		}
		return builder.toString();
	}
}
