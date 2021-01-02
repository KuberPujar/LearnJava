package com.learn.java.keywords;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;

/*The do keyword is used together with while to create a do-while loop.

The while loop loops through a block of code as long as a specified condition is true:

The do/while loop is a variant of the while loop. This loop will execute the code block once, 
before checking if the condition is true, then it will repeat the loop as long as the condition is true.

Note: Do not forget to increase the variable used in the condition, otherwise the loop will never end!

*/
public class DoKey {
	private final static Logger logger=Logger.getLogger(DoKey.class);
	public static void main(String[] args) {
		NDC.push(DoKey.class.getName());
		int i = 0;
		do {
		  logger.info(i);
		  i++;
		}
		while (i < 5);
	}

}
