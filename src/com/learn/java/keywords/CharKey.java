package com.learn.java.keywords;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;
/*The char keyword is a data type that is used to store a single character.

A char value must be surrounded by single quotes, like 'A' or 'c'.*/
public class CharKey {
	private final static Logger logger=Logger.getLogger(CharKey.class);
	public static void main(String[] args) {
		NDC.push(CharKey.class.getName());
		char myGrade = 'B';
		logger.info(myGrade);
	}

}
