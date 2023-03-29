package com.learn.java.controlstatements;

public class SumNumsBetween35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0,sum=0;
		for (int i = 1; i < 1000; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
               sum=sum+i;
               count++;
               if(count==5)
               {
            	   System.out.println("Got 5 numbers divisible by both 3 and 5");
            	   break;
               }
			}
		}
		System.out.println(sum);
	}

}
