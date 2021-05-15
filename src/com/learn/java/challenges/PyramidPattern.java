package com.learn.java.challenges;

import java.util.Scanner;

public class PyramidPattern {
	public static void main(String[] args) {

		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			int t = scanner.nextInt();
			if (t >= 1 && t <= 512) {
				for (int c = 1; c <= t; c++) {
					int n = scanner.nextInt();
					if (n >= 1 && n <= 32) {
						String hieght = scanner.next();
						hieght += scanner.nextLine();
						String hieghts[] = hieght.split(" ");
						int hh = n = hieghts.length;
						for (int h = 0; h < hh; h++) {
							if (Integer.parseInt(hieghts[h]) >= 1 && Integer.parseInt(hieghts[h]) <= 32) {

								int rows = Integer.parseInt(hieghts[h]), k = 0;
								for (int i = 1; i <= rows + 1; ++i, k = 0) {
									for (int space = 0; space <= rows - i; ++space) {
										System.out.print("  ");
									}

									while (k != 2 * i - 1) {
										System.out.print("* ");
										++k;
									}

									System.out.println();
								}

							}
						}
					}
				}
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		} finally {
			scanner.close();
		}

	
	}

//	public static void printPattern() {}

}
