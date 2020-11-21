package com.learn.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hello {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
     System.out.println("Hello!! welcome to Java world!!!");
         SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        // SimpleDateFormat f=new SimpleDateFormat("dd-MMM-yy");
         Date  now=new Date();
         String d = format.format(now);
         Date dd=format.parse(d);
         java.sql.Date sql = new java.sql.Date(dd.getTime());
         System.out.println(sql);
     
	}

}
