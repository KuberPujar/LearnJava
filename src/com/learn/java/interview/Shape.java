package com.learn.java.interview;

public abstract class Shape {
	private String color;

	// abstract method
	abstract double area();
	
//abstract class constructor
	public Shape(String color) {
		System.out.println("Shape constructor called..");
		this.color = color;
	}

//conctrete method
	public String getColor() {
		return this.color;
	}

	public abstract String toString();
}

class Circle extends Shape
{
   private double radius; 	 	
	public Circle(String color, double radius) {
		super(color);
		this.radius=radius;
		System.out.println("circle constructor called");
	}

	@Override
	double area() {
		return (Math.PI * Math.pow(radius, 2));
	}

	@Override
	public String toString() {
		return "Circle color is "+super.getColor()+" and area is "+area();
	}
	
}

class Rectangle extends Shape
{
	
	private double hieght;
	private double width;
	public Rectangle(String color,double hieght,double width) {
		super(color);
		this.hieght=hieght;
		this.width=width;
		System.out.println("Rectangle constructor called");
	}
	@Override
	double area() {
		return (hieght*width);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Rectangle.class.getName()+" color is "+super.getColor()+" and area is "+area();
	}
}

