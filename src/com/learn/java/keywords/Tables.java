package com.learn.java.keywords;

import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;

public class Tables {
	private final static Logger logger = Logger.getLogger(Tables.class);
	private static  Scanner scanner=null;
	public static void main(String[] args) {
		NDC.push(Tables.class.getName());
		logger.info("enter the number for table needs to form.");
		try
		{
			scanner=new Scanner(System.in);
			int nm=scanner.nextInt();
			for(int i=1;i<=nm;i++)
			{
				for(int j=1;j<=nm;j++)
				{
					logger.info(i+"*"+j+"="+(i*j));
				}
			}
		}
		catch (Exception e) {
			logger.error(e.fillInStackTrace());
		}
		finally {
			scanner.close();
		}
	}

}
