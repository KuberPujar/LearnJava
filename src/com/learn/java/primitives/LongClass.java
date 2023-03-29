package com.learn.java.primitives;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;
//64bit
public class LongClass {
	private final static Logger logger=Logger.getLogger(LongClass.class);
	public static void main(String[] args) {
    NDC.push("LongClass");
    long minlongVal=Long.MIN_VALUE;
    long maxlongVal=Long.MAX_VALUE;
    long num=10000L;
    long num1=10_10_10_1000L;
    logger.info("minimum value of Long::"+minlongVal);
    logger.info("maximum value of Long::"+maxlongVal);
    logger.info("busted minimum value of Long::"+(minlongVal-1));
    logger.info("busted maximum value of Long::"+(maxlongVal+1));
    logger.info("value of Long num::"+num);
    logger.info("value of Long num1::"+num1);
	}

}
