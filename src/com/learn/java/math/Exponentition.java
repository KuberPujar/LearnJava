package com.learn.java.math;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class Exponentition {
	private static final Logger logger = Logger.getLogger(Exponentition.class);
	private static Scanner scanner = null;
	private static double exponential = 0.0;

	public static void main(String[] args) {
		logger.info("Please enter number and its exponential power::");
		try {
			scanner = new Scanner(System.in);
			int number =  Math.abs(scanner.nextInt());
			int power = Math.abs(scanner.nextInt());

			if (!(number <= 0 && power <= 0 )) {
				exponential = Math.pow(Math.abs(number), Math.abs(power));
			} else {
				logger.info("Please enter correct values..");
				number = scanner.nextInt();
				power = scanner.nextInt();
			}
			logger.info("Entered number and its exponential power respectively::" + Math.abs(number) + " " + Math.abs(power));
			logger.info("exponential is::" + exponential);

		} catch (NullPointerException e) {
			logger.error(e.fillInStackTrace());
		} finally {
			scanner.close();
		}

	}

}
