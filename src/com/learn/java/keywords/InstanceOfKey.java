package com.learn.java.keywords;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;
/*The instanceof keyword checks whether an object is an instance of a specific class or an interface.

The instanceof keyword compares the instance with type. The return value is either true or false.*/
public class InstanceOfKey {
	private final static Logger logger=Logger.getLogger(InstanceOfKey.class);
	public static void main(String[] args) {
		NDC.push(InstanceOfKey.class.getName());
		     InstanceOfKey myObj = new InstanceOfKey();
		    logger.info(myObj instanceof Object); // returns true
	}

}
