package com.learn.java.keywords;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;

/*The double keyword is a data type that can store fractional numbers from 1.7e−308 to 1.7e+308.

Note that you should end the value with a "d"*/
public class DoubleKey {
	private final static Logger logger=Logger.getLogger(DoubleKey.class);
	public static void main(String[] args) {
		NDC.push(DoubleKey.class.getName());
		double myNum = 19.99d;
		logger.info(myNum);
	}

}
