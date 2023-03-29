package com.learn.java.challenges;

public class MyCalss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Book harryO=new Book();
harryO.setISBNCode("HP12345");
Book lar=new Book();
lar.setISBNCode("LR67890");
System.out.println(harryO.getISBNCode()+""+lar.getISBNCode());
	}

}
class Book
{
	public static String ISBNCode;

	public static String getISBNCode() {
		return ISBNCode;
	}

	public static void setISBNCode(String iSBNCode) {
		ISBNCode = iSBNCode;
	}
	
}