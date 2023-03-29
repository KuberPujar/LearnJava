package com.learn.java.challenges;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map  treeMap=new TreeMap<>();
treeMap.put(10, "India");
treeMap.put(2, "France");
treeMap.put(2, "Germany");
//treeMap.put(null, "null");
//System.out.println(treeMap);

//int arr[]=new int[-10];
//System.out.println(arr.length);

int a=2,b=3,c=4,d=5;
float k=4.3f;
System.out.println(--b*a+c*d--);
System.out.println(-4+1/2+2*-3+5.0);
System.out.println(mystery(12, 3));

int i=0;
i=i++ + i;
System.out.println("i="+i);
bar();

int[] age= {25,26,27,28,29};
int sum=0;
try
{
	for(int item:age)
	{
		sum+=item;
		System.out.println("Total age=");
		if(sum>125)
		{
			throw new Exception(sum+" is above 125");
		}
			
	
	}
	System.out.print("average age is ::"+sum/age.length);
}
catch(Exception e)
{
	System.out.println(e.getMessage());
}
	}

	public static int mystery(int x,int y)
	{
		if(x<=y) return x;
		else return mystery(x-y, y);
	}
	

	static int foo(int a,String s)
	{
		s="Yellow";
		a=a+2;
		return a;
	}
	
	static void bar()
	{
		int a=3;
		String s="Blue";
		a=foo(a,s);
		System.out.println("a="+a+"s="+s);
	}
}
