package com.learn.java.keywords;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;


/**
 * 	A non-access modifier. Used for classes and methods: An abstract class cannot 
 * be used to create objects (to access it, it must be inherited from another class).
 *  An abstract method can only be used in an abstract class, and it does not have a body. 
 *  The body is provided by the subclass (inherited from)
 * **/
public class AbstractKey {
	private final static Logger logger=Logger.getLogger(AbstractKey.class);
	public static void main(String[] args) {
		NDC.push(AbstractKey.class.getName());
		Student std=new Student();
		logger.info(" student name::"+std.fname);
		logger.info(" student age::"+std.age);
		logger.info(" student graduationYear::"+std.graduationYear);
		std.study();
	}

}

/**
 * An abstract method belongs to an abstract class, and it does not have a body. The body is provided by the subclass.**/
abstract class Main {
	  public String fname = "John";
	  public int age = 24;
	  public abstract void study(); // abstract method
	}

class Student extends Main
{
	private final static Logger logger=Logger.getLogger(Student.class);
	
	 public int graduationYear = 2018;
	  public void study() { // the body of the abstract method is provided here
		NDC.push(Student.class.getName());
	    logger.info("Studying all day long");
	   int aar[]= {1,2,9};
	    System.out.println(Arrays.stream(aar).sum());
	   
	    System.out.println();
	    System.out.println(Arrays.stream(aar).max());
	    
	    Optional<OptionalInt> i=Optional.of(Arrays.stream(aar).min()); 
	    System.out.println(i.get());
	  }
	
}
