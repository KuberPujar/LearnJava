package com.learn.java.polymorpism;

public class Car {
	private boolean engine;
	private int cylinders;
	private String name;
	private int wheels;

	public Car(int cylinders, String name) {
		this.cylinders = cylinders;
		this.name = name;
		this.engine = true;
		this.wheels = 4;
	}

	public void startEngine() {
		System.out.println("Car -> startEngine()");
	}

	public void accelerate() {
		System.out.println("Car -> accelerate()");
	}

	public void brake() {
		System.out.println("Car -> brake()");
	}

	public int getCylinders() {
		return cylinders;
	}

	public String getName() {
		return name;
	}
}

class Mitsubishi extends Car {

	public Mitsubishi(int cylinders, String name) {
		super(cylinders, name);
	}

	@Override
	public void startEngine() {
		System.out.println("Mitsubishi -> startEngine()");
	}

	@Override
	public void accelerate() {
		System.out.println("Mitsubishi -> accelerate()");
	}

	@Override
	public void brake() {
		System.out.println("Mitsubishi -> brake()");
	}
}

class Holden extends Car {

	public Holden(int cylinders, String name) {
		super(cylinders, name);
	}

	@Override
	public void startEngine() {
		System.out.println("Holden -> startEngine()");
	}

	@Override
	public void accelerate() {
		System.out.println("Holden -> accelerate()");
	}

	@Override
	public void brake() {
		System.out.println("Holden -> brake()");
	}
}

class Ford extends Car {

	public Ford(int cylinders, String name) {
		super(cylinders, name);
	}

	@Override
	public void startEngine() {
		System.out.println("Ford -> startEngine()");
	}

	@Override
	public void accelerate() {
		System.out.println("Ford -> accelerate()");
	}

	@Override
	public void brake() {
		System.out.println("Ford -> brake()");
	}
}
