package com.learn.java.keywords;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;
/*The int keyword is a data type that can store whole numbers from -2147483648 to 2147483647.*/
public class IntKey {
	private final static Logger logger=Logger.getLogger(IntKey.class);
	public static void main(String[] args) {
		NDC.push(IntKey.class.getName());
		int myNum = 100000;
		logger.info(myNum);
	}

}
