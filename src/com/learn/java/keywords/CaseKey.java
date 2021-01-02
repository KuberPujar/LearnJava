package com.learn.java.keywords;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;
/*The case keyword marks a block of code in a switch statement.*/
public class CaseKey {
	private final static Logger logger=Logger.getLogger(CaseKey.class);
	public static void main(String[] args) {
		NDC.push(CaseKey.class.getName());
		int day = 4;
		switch (day) {
		  case 1:
		    logger.info("Monday");
		    break;
		  case 2:
			  logger.info("Tuesday");
		    break;
		  case 3:
			  logger.info("Wednesday");
		    break;
		  case 4:
			  logger.info("Thursday");
		    break;
		  case 5:
			  logger.info("Friday");
		    break;
		  case 6:
			  logger.info("Saturday");
		    break;
		  case 7:
			  logger.info("Sunday");
		    break;
		}
	}

}
