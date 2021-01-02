package com.learn.java.keywords;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;
/*The continue keyword is used to end the current iteration in a for loop (or a while loop), and continues to the next iteration.*/
public class ContinueKey {
	private final static Logger logger=Logger.getLogger(ContinueKey.class);
	public static void main(String[] args) {
		NDC.push(ContinueKey.class.getName());
		int i = 0;
		while (i < 10) {
		  if (i == 4) {
		    i++;
		    continue;
		  }
		  logger.info(i);
		  i++;
		}
	}

}
