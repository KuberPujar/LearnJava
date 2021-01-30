package com.learn.java.polymorpism;

public class BillHumburgers {

	public static void main(String[] args) {
		Hamburger hamburger = new Hamburger("Basic", "white", "Sausage", 3.56);
		hamburger.addHamburgerAddition1("TOMATO", 0.25);
		hamburger.addHamburgerAddition2("ONION", 0.5);
		hamburger.addHamburgerAddition3("CAPSICUM", 0.13);
		hamburger.addHamburgerAddition4("CARROT", 0.27);
		System.out.println("Total price of burger " + hamburger.itemizeHamburger());
		
		HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
		healthyBurger.addHamburgerAddition1("Egg", 5.43);
		healthyBurger.addHealthyAddition1("Lentils", 3.41);
		System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger());

		DeluxeBurger db = new DeluxeBurger();
		db.addHamburgerAddition3("Should not do this", 50.53);
		System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());
	}

}
