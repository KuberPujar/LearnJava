package com.learn.java.memory;

public class Main {

	public static void main(String[] args) {

		Runtime runtime=Runtime.getRuntime();
		long availableBytes=runtime.freeMemory();
		System.out.println("Available memory::"+availableBytes/1024+"k");
		
		//let's create garbage
		for(int i=0;i<10000;i++)
		{
			Customer c;
			c=new Customer("John");
		}
		availableBytes=runtime.freeMemory();
		System.out.println("Available memory::"+availableBytes/1024+"k");
		
		System.gc();
		
		availableBytes=runtime.freeMemory();
		System.out.println("Available memory::"+availableBytes/1024+"k");
		
	}

}
