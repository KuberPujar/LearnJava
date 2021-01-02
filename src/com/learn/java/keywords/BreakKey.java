package com.learn.java.keywords;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;
/*The break keyword is used to break out a for loop, a while loop or a switch block.*/
public class BreakKey {
	private final static Logger logger=Logger.getLogger(BreakKey.class);
	public static void main(String[] args) {
		NDC.push(BreakKey.class.getName());
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    break;
			  }
			  logger.info(i);
			}
	}

}
