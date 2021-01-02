package com.learn.java.keywords;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;

/*The for loop loops through a block of code a number of times.

From the example above:

Statement 1 sets a variable before the loop starts (int i = 0).
Statement 2 defines the condition for the loop to run (i must be less than 5). If the condition is true,
 the loop will start over again, if it is false, the loop will end.
Statement 3 increases a value (i++) each time the code block in the loop has been executed.
There is also a "for-each" loop, which is used exclusively to loop through elements in an array:*/
public class ForKey {
	private final static Logger logger=Logger.getLogger(ForKey.class);
	public static void main(String[] args) {
		NDC.push(ForKey.class.getName());
		for (int i = 0; i < 5; i++) {
			  logger.info(i);
			}
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i : cars) {
			logger.info(i);
		}
	}

}
