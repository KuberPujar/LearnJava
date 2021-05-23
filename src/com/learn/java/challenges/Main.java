package com.learn.java.challenges;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Java();
		} catch (Exception r) {
			System.out.println("Exception caught");
		}
		python();
	}

	static void Java() {
		try {
			System.out.println("Inside Java");
			throw new RuntimeException("demo");
		} finally {
			System.out.println("Java's finally.");
		}
	}

	static void python() {
		try {
			System.out.println("Inside Python");
			return;
		} finally {
			System.out.println("Python's  finally.");
		}
	}
}
