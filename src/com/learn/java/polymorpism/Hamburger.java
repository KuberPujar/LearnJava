package com.learn.java.polymorpism;

public class Hamburger {
	    private String name;
	    private String meat;
	    private double price;
	    private String breadRollType;

	    private String addition1Name;
	    private double addition1Price;

	    private String addition2Name;
	    private double addition2Price;

	    private String addition3Name;
	    private double addition3Price;

	    private String addition4Name;
	    private double addition4Price;

	public Hamburger(String name,String breadRollType, String meat, double price) {
		super();
		this.breadRollType = breadRollType;
		this.meat = meat;
		this.price = price;
		this.name=name;
	}

	public String getName() {
		return name;
	};

	public void addHamburgerAddition1(String name, double price) {
		this.addition1Name = name;
		this.addition1Price = price;
	}

	public void addHamburgerAddition2(String name, double price) {
		this.addition2Name = name;
		this.addition2Price = price;
	}

	public void addHamburgerAddition3(String name, double price) {
		this.addition3Name = name;
		this.addition3Price = price;
	}

	public void addHamburgerAddition4(String name, double price) {
		this.addition4Name = name;
		this.addition4Price = price;
	}

	public double itemizeHamburger() {
		double baseHamburgerPrice = this.price;
		System.out.println(
				this.name + " hamburger on a " + this.breadRollType + " roll with "+this.meat+" price is " + this.price);

		if (this.addition1Name != null) {
			baseHamburgerPrice += this.addition1Price;
			System.out.println("Added " + this.addition1Name + " for as extra " + this.addition1Price);
		}

		if (this.addition2Name != null) {
			baseHamburgerPrice += this.addition2Price;
			System.out.println("Added " + this.addition2Name + " for as extra " + this.addition2Price);
		}

		if (this.addition3Name != null) {
			baseHamburgerPrice += this.addition1Price;
			System.out.println("Added " + this.addition3Name + " for as extra " + this.addition3Price);
		}

		if (this.addition4Name != null) {
			baseHamburgerPrice += this.addition1Price;
			System.out.println("Added " + this.addition4Name + " for as extra " + this.addition4Price);
		}
		return baseHamburgerPrice;
	}
}
