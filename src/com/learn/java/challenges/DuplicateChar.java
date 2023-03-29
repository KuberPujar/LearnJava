package com.learn.java.challenges;

import java.util.HashMap;
import java.util.Map;

public class DuplicateChar {

	public static void main(String[] args) {
		//duplicate("evening");
		duplicateCharUsingHashMap("zzyyuiopk");
	}

	public static void duplicate(String str) {
		if (str != null) {
			int count = 0;
			char[] chars = str.toCharArray();
			for (int i = 0; i < chars.length; i++) {
				count = 1;
				for (int j = i + 1; j < chars.length; j++) {
					if (chars[i] == chars[j] && chars[i] != ' ') {
						count++;
						chars[j] = 0;
					}
				}

				if (count > 1 && chars[i] != '0') {
					System.out.println(chars[i]);
				}
			}
		}
	}

	public static void duplicateCharUsingHashMap(String str) {
		Map<Character, Integer> map = new HashMap<>();
		if (str != null) {
			char[] chars = str.toCharArray();
			for (char c : chars) {
				if (map.containsKey(c)) {
					map.put(c, map.get(c) + 1);
				} else {
					map.put(c, 1);
				}
			}

			map.entrySet().stream().filter(s->s.getValue()>1).map(i->(int)i.getKey()).sorted().map(Character::toChars).findFirst().stream().forEach(System.out::print);
			map.clear();
		}
	}
}
