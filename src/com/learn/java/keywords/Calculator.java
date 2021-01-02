package com.learn.java.keywords;

import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;

public class Calculator {
	private final static Logger logger = Logger.getLogger(Calculator.class);

	public static void main(String[] args) {
		Scanner input = null;
		try {
			NDC.push(Calculator.class.getName());
			logger.info("****************Welcome to Calculator Application****************");
			logger.info("Enter the firstNumer::");
			input = new Scanner(System.in);
			double firstNum = input.nextDouble();
			logger.info("Enter the SecondNumer::");
			double SecondNum = input.nextDouble();
			logger.info("Enter the Operation need to perform::");
			String opration = input.next();
			logger.info("Entered the firstNumer::" + firstNum + " and SecondNumer::" + SecondNum + " and operation::"
					+ opration);
			switch (opration) {
			case "+":
				logger.info("Addition of " + firstNum + " secondNum is::" + (firstNum + SecondNum));
				break;

			case "-":
				logger.info("Substraction of " + firstNum + " secondNum is::" + (firstNum - SecondNum));
				break;

			case "*":
				logger.info("Multiplication of " + firstNum + " secondNum is::" + (firstNum * SecondNum));
				break;

			case "/":
				logger.info("Addition of " + firstNum + " secondNum is::" + (firstNum / SecondNum));
				break;
            
			case "%":
				logger.info("Reminder of " + firstNum + " secondNum is::" + (firstNum % SecondNum));
				break;
				
			default:
				logger.info("Not a valid data, please proper values.");
				break;
			}

		} catch (Exception e) {
			logger.error(e.fillInStackTrace());
		} finally {
			input.close();
			logger.info("scanner has been closed");
		}
	}

}
