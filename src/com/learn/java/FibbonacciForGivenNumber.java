package com.learn.java;

import java.util.Scanner;

class FibbonacciForGivenNumber {

	
	public static void main(String[] args) {
		getFiboSeries(10);
		fibonacci();
		String str=new String();
	}

	private static void getFiboSeries(int num) {
		long n1 = 1, n2 = 1, sum = 0;
		for (int j = 1; j <= num; j++) {
			System.out.print(n1 + " ");
			sum = n1 + n2;
			n1 = n2;
			n2 = sum;
		}
	}
	
	 public static void fibonacci() 
	    {
	        int numb1 = 1;
	        int numb2 = 1;
	        int temp = 0;
	 
	         
	        Scanner input=new Scanner(System.in);
	        System.out.println("How Many Terms? (Up To 45)");
	        int x=input.nextInt();
	        x=x-2;
	 
	        System.out.println(numb1);
	        System.out.println(numb2);
	 
	        for (int i = 0; i<  x; i++) 
	        {
	            System.out.println(numb1 + numb2 + " ");
	            temp = numb1;
	            numb1 = numb2;
	            numb2 = temp + numb2;
	        }
	    }
	}

