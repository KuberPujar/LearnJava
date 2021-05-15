package com.learn.java.interview;

public class TestShape {

	public static void main(String[] args) {
		Shape circle = new Circle("Blue", 8.9);
		Shape rectangle = new Rectangle("Red", 9.5, 5.5);
		System.out.println(circle.toString());
		System.out.println(rectangle.toString());
	}

}
