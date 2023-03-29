package com.learn.java.interview;

public class Palindrome {

	public static void main(String[] args) {
//getPalindromeWithStringBuilder("aba");
getPalindrome("kanak");
System.out.println(removeChar("Kuber@", '@'));

	}

	public static void getPalindromeWithStringBuilder(String str)
	{
		if(str!=null)
		{
			StringBuilder builder=new StringBuilder(str);
			System.out.println(str.equals(builder.reverse().toString()));
			
		}
	}
	
	public static void getPalindrome(String str)
	{
		if(str!=null)
		{
			int length=str.length();
			for(int i=0;i<length;i++)
			{ 
				if(str.charAt(i)!=str.charAt(length-i-1))
				{
					System.out.println(false);
				}
				else
				{
					System.out.println(true);
				}
			}
			
		}
	}
	
	   private static String removeChar(String str, char c) {
	        if (str == null)
	            return null;
	        return str.replaceAll(Character.toString(c), "");
	    }
}
