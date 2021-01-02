package com.learn.java.keywords;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;
/*The else statement specifies a block of Java code to be executed if a condition is false in an if statement.

Java has the following conditional statements:

Use if to specify a block of code to be executed, if a specified condition is true
Use else to specify a block of code to be executed, if the same condition is false
Use else if to specify a new condition to test, if the first condition is false
Use switch to specify many alternative blocks of code to be executed*/
public class ElseKey {
	private final static Logger logger=Logger.getLogger(ElseKey.class);
	public static void main(String[] args) {
		NDC.push(ElseKey.class.getName());
		int time = 22;
		if (time < 10) {
			logger.info("Good morning.");
		} else if (time < 20) {
			logger.info("Good day.");
		} else {
			logger.info("Good evening.");
		}
		// Outputs "Good evening."
	}

}
