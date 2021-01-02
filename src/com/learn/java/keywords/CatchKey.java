package com.learn.java.keywords;
/*The catch keyword catches exceptions generated by try statements.

The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.

*/
import org.apache.log4j.Logger;
import org.apache.log4j.NDC;

public class CatchKey {
	private final static Logger logger=Logger.getLogger(CatchKey.class);
	public static void main(String[] args) {
		NDC.push(CatchKey.class.getName());
		try {
			  int[] myNumbers = {1, 2, 3};
			  logger.info(myNumbers[10]);
			} catch (Exception e) {
				logger.info("Something went wrong."+e.getMessage());
			}
	}

}
