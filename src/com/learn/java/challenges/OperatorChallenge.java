package com.learn.java.challenges;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;

public class OperatorChallenge {
	private final static Logger logger=Logger.getLogger(OperatorChallenge.class);
public static void main(String args[])
{
	NDC.push(OperatorChallenge.class.getName());
	 double num=20.00;
	 double num2=80.00;
	 double reminder=((num+num2)*100)%40;
	 logger.info("Reminder of "+((num+num2)*100)+" and "+40+" is "+reminder);
	 boolean isRemZero=(reminder==0)?true:false;
	 if(!isRemZero)
	 {
		logger.info("Got some reminder::"+reminder);
	 }
	 else
	 {
		 logger.info("Reminder is zero::"+reminder);
	 }
}
}
