package com.learn.java.keywords;

import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;
/*The import keyword is used to import a package, class or interface.*/
public class ImportKey {
	private final static Logger logger=Logger.getLogger(ImportKey.class);
	public static void main(String[] args) {
		NDC.push(ImportKey.class.getName());
		Scanner myObj=null;
		try
		{
			myObj = new Scanner(System.in);
		    logger.info("Enter username");
		    String userName = myObj.nextLine();
		    logger.info("Username is: " + userName);
		}
		catch(Exception e)
		{
			logger.error(e.fillInStackTrace());
		}
		finally
		{
			myObj.close();
		}
		 
	}

}
