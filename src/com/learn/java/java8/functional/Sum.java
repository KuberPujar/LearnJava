package com.learn.java.java8.functional;

import java.util.stream.IntStream;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//imperative approach
		int sum=0;
		for(int i=0;i<=100;i++)
		{
			sum+=i;
		}
		System.out.println("Imperative sum::"+sum);
		
		//declarative sum
		int sum1=IntStream.rangeClosed(0, 100)
				.parallel()
				.sum();
		System.out.println("Declarative approach::"+sum1);
	}

}
