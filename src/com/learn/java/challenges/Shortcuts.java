package com.learn.java.challenges;

import java.time.LocalTime;
import java.util.Scanner;
import java.util.logging.Logger;

public class Shortcuts {
	private static Logger logger = Logger.getLogger(Shortcuts.class.getSimpleName());

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		var name = "";
		logger.info("Enter your name:");
		if (scanner.hasNext()) {
			name = scanner.next();
		} else {
			scanner.close();
		}

		int hour = LocalTime.now().getHour();

		if (hour < 11) {
			logger.fine("Good morning, " + name);
		} else if (hour < 15) {
			logger.info("Good afternoon, " + name);
		} else {
			logger.info("Good evening, " + name);
		}
	}

}
