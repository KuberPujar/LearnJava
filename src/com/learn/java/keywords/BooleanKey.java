package com.learn.java.keywords;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;

public class BooleanKey {
	private final static Logger logger=Logger.getLogger(BooleanKey.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NDC.push(BooleanKey.class.getName());
		boolean isJavaFun = true;
		boolean isFishTasty = false;
		logger.info(isJavaFun);     // Outputs true
		logger.info(isFishTasty);   // Outputs false
	}

}
