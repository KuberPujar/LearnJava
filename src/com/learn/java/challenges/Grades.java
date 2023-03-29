package com.learn.java.challenges;

import java.util.Scanner;
import java.util.logging.Logger;

public class Grades {

	private static Logger logger = Logger.getLogger(Grades.class.getName());

	public static void main(String[] args) {
		var in = new Scanner(System.in);
		double score = 0;
		logger.info("Enter the raw score : ");
		if (in.hasNext()) {
			score = in.nextDouble();
		} else {
			in.close();
		}
		if (score > 90) {
			logger.info("Excellent job, you got an A");
		} else if (score > 80) {
			logger.info("Nice job, you got a B");
		} else if (score > 70) {
			logger.info("You got a C");
		} else if (score > 60) {
			logger.info("You need to study more to receive good grade");
		} else {
			logger.info("You failed, get tutor");
		}

	}

}
