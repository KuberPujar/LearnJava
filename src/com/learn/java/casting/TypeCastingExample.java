package com.learn.java.casting;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;

public class TypeCastingExample {
	private static final Logger logger = Logger.getLogger(TypeCastingExample.class);

	public static void main(String args[]) {
		NDC.push(TypeCastingExample.class.getName());
		int maxIntVal = Integer.MAX_VALUE;
		byte bt = (byte) (maxIntVal / 2);
		short newShort = (Short.MIN_VALUE / 2);
		logger.info("byte value after type cast::" + bt);
		logger.info("newShort value after type cast::" + newShort);
	}
}
