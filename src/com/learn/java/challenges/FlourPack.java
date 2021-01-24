package com.learn.java.challenges;

public class FlourPack {

	public static void main(String[] args) {
		System.out.println(canPack(1, 0, 4));// should return false since bigCount is 1 (big bag of 5 kilos) and goal is
												// 4 kilos.

		System.out.println(canPack(1, 0, 5)); // should return true since bigCount is 1 (big bag of 5 kilos) and goal is
												// 5 kilos.

		System.out.println(canPack(0, 5, 4)); // should return true since smallCount is 5 (small bags of 1 kilo) and
												// goal is 4 kilos, and we have 1 bag left which is ok as mentioned
												// above.

		System.out.println(canPack(2, 2, 11)); // should return true since bigCount is 2 (big bags 5 kilos each) and
												// smallCount is 2 (small bags of 1 kilo), makes in total 12 kilos and
												// goal is 11 kilos.

		System.out.println(canPack(-3, 2, 12)); // should return false since bigCount is negative.

	}

	public static boolean canPack(int big, int small, int goal) {
		if (big >= 0 && small >= 0 && goal > 0) {
			for (; big > 0; big--) {
				if (goal >= big * 5)
					goal -= 5;
			}
			for (; small > 0; small--) {
				if (goal >= 1)
					goal -= 1;
			}
			return goal == 0;
		}
		return false;
	}
}
