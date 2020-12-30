package com.learn.java.airthmatic;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;

public class ArithmaticClass {

	private static final Logger logger=Logger.getLogger(ArithmaticClass.class);
	public static void main(String[] args) {
    NDC.push(ArithmaticClass.class.getCanonicalName());
    
	}

}
