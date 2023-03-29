package com.learn.java.keywords;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;
/*The if statement specifies a block of Java code to be executed if a condition is true.

Java has the following conditional statements:

Use if to specify a block of code to be executed, if a specified condition is true
Use else to specify a block of code to be executed, if the same condition is false
Use else if to specify a new condition to test, if the first condition is false
Use switch to specify many alternative blocks of code to be executed
*/
public class IfKey {
	private final static Logger logger=Logger.getLogger(IfKey.class);
	public static void main(String[] args) {
		NDC.push(IfKey.class.getName());
		int x = 20;
		int y = 18;
		if (x > y) {
		  logger.info("x is greater than y");
		}
		
		int time = 20;
		if (time < 18) {
			logger.info("Good day.");
		} else {
			logger.info("Good evening.");
		}
		// Outputs "Good evening."
		
		int time1= 22;
		if (time < 10) {
			 logger.info("Good morning.");
		} else if (time1 < 20) {
			 logger.info("Good day.");
		} else {
			 logger.info("Good evening.");
		}
	}

}
