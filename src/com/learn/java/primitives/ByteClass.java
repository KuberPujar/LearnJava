package com.learn.java.primitives;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;
//8bite
public class ByteClass {
	private final static Logger logger=Logger.getLogger(ByteClass.class);
	public static void main(String[] args) {
    NDC.push("ByteClass");
    byte minByteVal=Byte.MIN_VALUE;
    byte maxByteVal=Byte.MAX_VALUE;
    logger.info("minimum value of Byte::"+minByteVal);
    logger.info("maximum value of Byte::"+maxByteVal);
   
	}
}
