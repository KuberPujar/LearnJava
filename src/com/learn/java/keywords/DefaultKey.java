package com.learn.java.keywords;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;

/*The default keyword the default block of code in a switch statement.

The default keyword specifies some code to run if there is no case match in the switch.

Note: if the default keyword is used as the last statement in a switch block, it does not need a break.*/
public class DefaultKey {
	private final static Logger logger=Logger.getLogger(DefaultKey.class);
	public static void main(String[] args) {
		NDC.push(DefaultKey.class.getName());
		int day = 6;
		switch (day) {
		  case 6:
		   logger.info("Today is Saturday");
		    break;
		  case 7:
			  logger.info("Today is Sunday");
		    break;
		  default:
			  logger.info("Looking forward to the Weekend");
		}
		// Outputs "Looking forward to the Weekend"
	}

}
