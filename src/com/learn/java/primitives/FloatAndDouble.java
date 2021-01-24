package com.learn.java.primitives;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;


public class FloatAndDouble {
	private static final Logger logger = Logger.getLogger(FloatAndDouble.class);
	public static void main(String[] args) {
		NDC.push(FloatAndDouble.class.getName());
		//64bit
        float minFloatVal=Float.MIN_VALUE;
        float maxFloatVal=Float.MAX_VALUE;
        logger.info("minimum value of float::"+minFloatVal);
        logger.info("maximum value of float::"+maxFloatVal);
        
        //64 bit
        double minDoubleVal=Double.MIN_VALUE;
        double maxDoubleVal=Double.MAX_VALUE;
        logger.info("minimum value of Double::"+minDoubleVal);
        logger.info("maximum value of Double::"+maxDoubleVal);
        
        @SuppressWarnings("unused")
		int intVal=500;
        @SuppressWarnings("unused")
		double doubleVal=500.789d;
        @SuppressWarnings("unused")
		float floatVal=500.890f;
	}

}
