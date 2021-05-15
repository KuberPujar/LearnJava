package com.learn.java.interview;

import java.io.Serializable;

public class DemoSingleton implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private int number;
	private DemoSingleton() {

	}

	private static class DemoSingletonInstanceHolder {
		private static final DemoSingleton INSTANCE = new DemoSingleton();
	}

	public static DemoSingleton getInstance() {
		return DemoSingletonInstanceHolder.INSTANCE;
	}

	protected Object readResolve() {
		return getInstance();
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
}
