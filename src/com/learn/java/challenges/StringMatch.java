package com.learn.java.challenges;

public class StringMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String regex=".@.";
StringMatch.compare(".@.", regex);
StringMatch.compare("a@N", regex);
StringMatch.compare("Java@program.com", regex);
	}
public static void compare(String str,String regex)
{
	if(str.matches(regex))
	{
		System.out.println(str +" matches");
	}	
	else
	{
		System.out.println(str+" does not match");
	}
}
}
