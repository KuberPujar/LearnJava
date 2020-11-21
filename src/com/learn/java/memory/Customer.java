package com.learn.java.memory;

public class Customer {
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Customer [name=" + name + "]";
}

public Customer(String name) {
	this.name = name;
}

public Customer(Customer oldCust) {
	this.name = oldCust.name;
}

public void finalize()
{
	System.out.println("This object being gcd..");
}
}
