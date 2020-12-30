package com.learn.java.primitives;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;

public class CharAndBoolean {
	private static final Logger logger = Logger.getLogger(CharAndBoolean.class);
	public static void main(String[] args) {
		NDC.push(CharAndBoolean.class.getName());
		char myChar='D';
		char myUnicodeChar='\u0044';
		logger.info("myChar::"+myChar);
		logger.info("myUnicode::"+myUnicodeChar);
		char anotherUnicode='\u00A9';
		logger.info("anotherUnicode::"+anotherUnicode);
		
		boolean myTrueFlag=true;
		boolean myFalseFlag=false;
		//int,long,double,char,float,double,byte,boolean
	}

}
