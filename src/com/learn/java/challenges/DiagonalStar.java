package com.learn.java.challenges;

public class DiagonalStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSquareStar(4);
	}

	public static void printSquareStar(int n) {
		if (n >= 5) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {

					if (i == 0 || j == 0 || i == j || i == n - 1 || j == n - 1 || i + j == n - 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		} else {
			System.out.println("Invalid Value");
		}
	}
}
