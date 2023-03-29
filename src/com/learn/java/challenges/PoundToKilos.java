package com.learn.java.challenges;

import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;

public class PoundToKilos {
	private static final Logger logger = Logger.getLogger(PoundToKilos.class);

	public static void main(String[] args) {
		NDC.push(PoundToKilos.class.getName());
		logger.info("Enter the Pounds to be converted into Kilos::");
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			double inputValue = scanner.nextDouble();
			double pound = inputValue * 0.45359237f;
			logger.info("pound to kilos value::" + pound);
		} catch (Exception e) {
			logger.error(e.fillInStackTrace());
		} finally {
			scanner.close();
		}

	}

}
