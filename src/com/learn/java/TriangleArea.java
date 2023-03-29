package com.learn.java;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class TriangleArea {
private static final Logger logger=Logger.getLogger(TriangleArea.class);
	public static void main(String[] args) {
    logger.info("Lets calculate the area of Triangle..");
    @SuppressWarnings("resource")
	Scanner scanner=new Scanner(System.in);
    logger.info("Please input the base of triangle in inches..");
    double base=scanner.nextDouble();
    while(base <=0)
    {
    	logger.info("Invalid base, please enter base in inches..");
    	base=scanner.nextDouble();
    }
    logger.info("entered base is::"+base);
    logger.info("Please input the hieght of triangle in inches..");
    double hieght=scanner.nextDouble();
    while(hieght <=0)
    {
    	logger.info("Invalid hieght, please enter hieght in inches..");
    	hieght=scanner.nextDouble();
    }
    logger.info("entered hieght is::"+hieght);
    double area=(base * hieght)/2;
    logger.info("calculated area is::"+area);
    
	}

}
