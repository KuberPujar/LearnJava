package com.learn.java.polymorpism;

public class DeluxeBurger extends Hamburger {

	public DeluxeBurger() {
		super("Delx", "White", "Sausage & Bacon", 14.58);
		super.addHamburgerAddition1("Chips", 2.75);
		super.addHamburgerAddition2("Drink", 1.81);
	}

	@Override
	public void addHamburgerAddition1(String name, double price) {

	}

	@Override
	public void addHamburgerAddition2(String name, double price) {

	}

	@Override
	public void addHamburgerAddition3(String name, double price) {

	}

	@Override
	public void addHamburgerAddition4(String name, double price) {

	}
}
