package com.learn.java.primitives;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;

//16bit
public class CharClass {
	private final static Logger logger=Logger.getLogger(CharClass.class);
	public static void main(String[] args) {
    NDC.push("CharClass");
    short minShortVal=Short.MIN_VALUE;
    short maxShortVal=Short.MAX_VALUE;
    logger.info("minimum value of Short::"+minShortVal);
    logger.info("maximum value of Short::"+maxShortVal);
}
}
