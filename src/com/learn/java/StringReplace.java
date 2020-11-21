package com.learn.java;

public class StringReplace {

	public static void main(String[] args) {
	   
	            String str = "oooooo-hhhh-oooooo";  
	            String rs = str.replace("h","s"); // Replace 'h' with 's'  
	            System.out.println(rs);  
	            rs = rs.replace("s","h"); // Replace 's' with 'h'  
	            System.out.println(rs);  
	   
	}

}
