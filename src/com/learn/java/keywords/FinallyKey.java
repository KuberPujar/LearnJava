package com.learn.java.keywords;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;
/*The finally keyword is used to execute code (used with exceptions - try..catch statements) no matter if there is an exception or not.*/
public class FinallyKey {
	private final static Logger logger=Logger.getLogger(FinallyKey.class);
	public static void main(String[] args) {
		NDC.push(FinallyKey.class.getName());
		try {
			  int[] myNumbers = {1, 2, 3};
			  logger.info(myNumbers[10]);
			} catch (Exception e) {
				 logger.info("Something went wrong."+e.getMessage());
			} finally {
				 logger.info("The 'try catch' is finished.");
			}
	}

}
