package com.learn.java.controlstatements;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int startNum = 4;
		int finishNum = 20;
		int count = 0;
		do {
			startNum++;
			if (isEvenNumber(startNum)) {
				System.out.println(startNum);
				count++;
			}
			if(count==5)
			{
				break;
			}
		
		} while (startNum <= finishNum);
		
		System.out.println(count);
	}

	public static boolean isEvenNumber(int number) {
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
