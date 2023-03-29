package com.learn.java.primitives;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;
//32bite
public class IntClass {
    
	private final static Logger logger=Logger.getLogger(IntClass.class);
	public static void main(String[] args) {
    NDC.push("IntClass");
    int minIntVal=Integer.MIN_VALUE;
    int maxIntVal=Integer.MAX_VALUE;
    logger.info("minimum value of Integer::"+minIntVal);
    logger.info("maximum value of Integer::"+maxIntVal);
    logger.info("busted minimum value of Integer::"+(minIntVal-1));
    logger.info("busted maximum value of Integer::"+(maxIntVal+1));
	}

}

