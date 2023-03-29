package com.learn.java.keywords;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;
/*The byte keyword is a data type that can store whole numbers from -128 to 127.*/
public class ByteKey {
	private final static Logger logger=Logger.getLogger(ByteKey.class);
	public static void main(String[] args) {
		NDC.push(ByteKey.class.getName());
		byte myNum = 100;
		logger.info(myNum);
	}

}
