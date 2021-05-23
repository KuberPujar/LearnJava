package com.lean.java.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class SetMain {

	private static final Consumer<String> consumer = s -> System.out.printf(s + " ");
	private static final Consumer<String> consumerLn = System.out::println;

	public static void main(String[] args) {
		Set<Integer> sqares = new HashSet<>();
		Set<Integer> cubes = new HashSet<>();
		for (int i = 1; i <= 100; i++) {
			sqares.add(i * i);
			cubes.add(i * i * i);
		}

		System.out.println("There are " + sqares.size() + " squares and " + cubes.size() + " cubes.");

		Set<Integer> union = new HashSet<>(sqares);
		union.addAll(cubes);
		System.out.println("Union contains " + union.size() + " elements.");

		Set<Integer> intersection = new HashSet<>(sqares);
		intersection.retainAll(cubes);
		System.out.println("Intersection contains " + intersection.size() + " elements.");
		intersection.stream().forEach(
				i -> consumerLn.accept(i + " is the square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i)));

		Set<String> words = new HashSet<>();
		var sentence = "one day in the year of the fox";
		String[] arrayWords = sentence.split(" ");
		words.addAll(Arrays.asList(arrayWords));
		words.stream().forEach(s -> consumer.accept(s));
		consumerLn.accept("");
		Set<String> nature = new HashSet<>();
		Set<String> devine = new HashSet<>();
		String[] natureWords = { "all", "nature", "is", "but", "art", "unknown", "to", "thee" };
		nature.addAll(Arrays.asList(natureWords));

		String[] divineWords = { "to", "err", "is", "human", "to", "forgive", "divine" };
		devine.addAll(Arrays.asList(divineWords));

		consumerLn.accept("divine - nature::");
		Set<String> diff1 = new HashSet<>(devine);
		diff1.removeAll(nature);
		diff1.stream().forEach(consumer);
		consumerLn.accept("");
		consumerLn.accept("nature - divine::");
		Set<String> diff2 = new HashSet<>(nature);
		diff2.removeAll(devine);
		diff2.stream().forEach(consumer);
		consumerLn.accept("");
		Set<String> unionTest=new HashSet<>(nature);
		unionTest.addAll(devine);
		Set<String> intersectionTest=new HashSet<>(nature);
		intersectionTest.retainAll(devine);
		
		consumerLn.accept("Symmetric difference::");
		unionTest.removeAll(intersectionTest);
		unionTest.stream().forEach(consumer);
		consumerLn.accept("");
		if(nature.containsAll(devine))
		{
			consumerLn.accept("divine is subset of nature");
		}
		
		if(nature.containsAll(intersectionTest))
		{
			consumerLn.accept("intersection is subset of nature");
		}
		
		if(devine.containsAll(intersectionTest))
		{
			consumerLn.accept("intersection is subset of devine");
		}
	}

}
