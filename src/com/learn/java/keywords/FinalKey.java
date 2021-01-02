package com.learn.java.keywords;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;
/*The final keyword is a non-access modifier used for classes, attributes and methods, which makes them non-changeable
 *  (impossible to inherit or override).

The final keyword is useful when you want a variable to always store the same value, like PI (3.14159...).

The final keyword is called a "modifier".*/
public class FinalKey {
	private final static Logger logger=Logger.getLogger(FinalKey.class);
    static final int x = 10;
	public static void main(String[] args) {
		NDC.push(FinalKey.class.getName());
		  FinalKey myObj = new FinalKey();
		   // myObj.x = 25; // will generate an error: cannot assign a value to a final variable
		    logger.info(myObj.x);
	}

}
