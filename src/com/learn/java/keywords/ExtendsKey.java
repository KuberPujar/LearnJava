package com.learn.java.keywords;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;

/*The extends keyword extends a class (indicates that a class is inherited from another class).

In Java, it is possible to inherit attributes and methods from one class to another.
 We group the "inheritance concept" into two categories:

subclass (child) - the class that inherits from another class
superclass (parent) - the class being inherited from
To inherit from a class, use the extends keyword.*/
public class ExtendsKey {
	private final static Logger logger=Logger.getLogger(ExtendsKey.class);
	public static void main(String[] args) {
		NDC.push(ExtendsKey.class.getName());
		Car car = new Car();
	}

}

class Vehicle {
	private final static Logger logger=Logger.getLogger(Vehicle.class);
	  protected String brand = "Ford";         // Vehicle attribute
	  public void honk() {                     // Vehicle method
	   NDC.push(Vehicle.class.getName());
	   logger.info("Tuut, tuut!");
	  }
	}

class Car extends Vehicle {
	private final static Logger logger=Logger.getLogger(Car.class);
	  private String modelName = "Mustang";    // Car attribute
	  public static void main(String[] args) {
		  NDC.push(Car.class.getName());
	    // Create a myCar object
	    Car myCar = new Car();

	    // Call the honk() method (from the Vehicle class) on the myCar object
	    myCar.honk();

	    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
	    logger.info(myCar.brand + " " + myCar.modelName);
	  }
	}
