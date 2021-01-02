
package com.learn.java.keywords;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;

/*The class keyword is used to create a class.
Every line of code that runs in Java must be inside a class.
A class should always start with an uppercase first letter, and the name of the java file must match the class name.
A class is like an object constructor. See the example below to see how we can use it to create an object.

*/
public class ClassKey {
	private final static Logger logger=Logger.getLogger(ClassKey.class);
	public static void main(String[] args) {
		NDC.push(ClassKey.class.getName());
		 logger.info("Hello World");
	}

}
