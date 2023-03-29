package com.learn.java.challenges;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;

public class TypeCastingChallenge {
	private static final Logger logger = Logger.getLogger(TypeCastingChallenge.class);

	public static void main(String[] args) {
		NDC.push(TypeCastingChallenge.class.getName());
		byte bt=127;
		short newShort=12332;
		
		int newIntVal=1254334415;
		long newLongVal=(50000L+10L*(bt+newIntVal+newShort));
		logger.info("long value::"+newLongVal);
		short newShortVal=(short) (1000+10*(bt+newShort+newIntVal));
		logger.info("short value::"+newShortVal);
	}
	
	  
	}


