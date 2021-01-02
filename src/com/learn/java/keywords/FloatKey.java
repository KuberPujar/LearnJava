package com.learn.java.keywords;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;
/*The float keyword is a data type that can store fractional numbers from 3.4e−038 to 3.4e+038.

Note that you should end the value with an "f":*/
public class FloatKey {
	private final static Logger logger=Logger.getLogger(FloatKey.class);
	public static void main(String[] args) {
		NDC.push(FloatKey.class.getName());
		float myNum = 5.75f;
		logger.info(myNum);
	}

}
