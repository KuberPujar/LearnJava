package com.learn.java.keywords;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;

/*The interface keyword is used to declare a special type of class that only contains abstract methods.

To access the interface methods, the interface must be "implemented" (kinda like inherited) 
by another class with the implements keyword (instead of extends). The body of the interface method is
 provided by the "implement" class.

Notes on Interfaces:
It cannot be used to create objects (in the example above, it is not possible to create an "Animal" object in the MyMainClass)
Interface methods does not have a body - the body is provided by the "implement" class
On implementation of an interface, you must override all of its methods
Interface methods are by default abstract and public
Interface attributes are by default public, static and final
An interface cannot contain a constructor (as it cannot be used to create objects)
Why And When To Use Interfaces?
To achieve security - hide certain details and only show the important details of an object (interface).

Java does not support "multiple inheritance" (a class can only inherit from one superclass).
 However, it can be achieved with interfaces, because the class can implement multiple interfaces. 
 Note: To implement multiple interfaces,
separate them with a comma (see example below).*/
public class Interfacekey {

	public static void main(String[] args) {
		PigClass pig = new PigClass();
		pig.animalSound();
		pig.sleep();
	}

}

//interface
interface AnimalType {
	public void animalSound(); // interface method (does not have a body)

	public void sleep(); // interface method (does not have a body)
}

//Pig "implements" the Animal interface
class PigClass implements AnimalType {
	private final static Logger logger = Logger.getLogger(PigClass.class);

	public void animalSound() {
		NDC.push(PigClass.class.getName());
		// The body of animalSound() is provided here
		logger.info("The pig says: wee wee");
	}

	public void sleep() {
		// The body of sleep() is provided here
		logger.info("Zzz");
	}
}