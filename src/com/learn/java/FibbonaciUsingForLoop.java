package com.learn.java;

public class FibbonaciUsingForLoop {

	public static void main(String[] args) {
        int i=10,n1=0,n2=1,sum=0;
        
        for(int j=1;j<=i;j++)
        {
        	System.out.print(n1 + " ");
        	sum=n1+n2;
        	n1=n2;
        	n2=sum;
        }
	}

}
