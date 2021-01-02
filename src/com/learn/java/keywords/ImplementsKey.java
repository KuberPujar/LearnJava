package com.learn.java.keywords;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;

/*The implements keyword is used to implement an interface.

The interface keyword is used to declare a special type of class that only contains abstract methods.

To access the interface methods, the interface must be "implemented" (kinda like inherited) by another class with the implements
 keyword (instead of extends). The body of the interface method is provided by the "implement" class.

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
 Note: To implement multiple interfaces, separate them with a comma (see example below).*/
public class ImplementsKey {
	private final static Logger logger=Logger.getLogger(ImplementsKey.class);
	public static void main(String[] args) {
		NDC.push(ImplementsKey.class.getName());
		Pig pig=new Pig();
		pig.animalSound();
		pig.sleep();
		
		DemoClass demo=new DemoClass();
		demo.firstMethod();
		demo.secondMethod();
	}

}

//interface
interface Animal
{
	public void animalSound();// interface method (does not have a body)
	abstract void sleep();// interface method (does not have a body)
}

//Pig "implements" the Animal interface
class Pig implements Animal
{
	private final static Logger logger=Logger.getLogger(Pig.class);

	 // The body of animalSound() is provided here
	@Override
	public void animalSound() {
		//NDC.push(Pig.class.getName());
		logger.info("pig says:: wee wee");
	}

	 // The body of sleep() is provided here
	@Override
	public void sleep() {
		NDC.push(Pig.class.getName());
		logger.info("pig sleeps:: Zzzzz");
	}
	
}

//Multiple interface implementation with comma separation.
interface FirstInterface
{
	abstract void firstMethod();
}

interface SecondInterface
{
	abstract void secondMethod();
}

class DemoClass implements FirstInterface,SecondInterface
{
	private final static Logger logger=Logger.getLogger(DemoClass.class);
	@Override
	public void secondMethod() {
		NDC.push(DemoClass.class.getName());
		logger.info("some text..");
	}

	@Override
	public void firstMethod() {
		//NDC.push(DemoClass.class.getName());
		logger.info("some other text..");
	}
	
}