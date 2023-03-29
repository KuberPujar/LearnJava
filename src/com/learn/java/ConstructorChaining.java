package com.learn.java;

import lombok.Value;

@Value
public class ConstructorChaining {
	private String s;
	private int k;

	public ConstructorChaining() {
		this("this message");
	}

	public ConstructorChaining(String string) {
		this(string, 6);
	}

	public ConstructorChaining(String string, int i) {
		this.s = string;
		this.k = i;
	}

	public static void main(String[] args) {
		ConstructorChaining c = new ConstructorChaining("String");
	}
	class Human{
		   public void walk()
		   {
		       System.out.println("Human walks");
		   }
		}
		class Boy extends Human{
		   public void walk(){
		       System.out.println("Boy walks");
		   }
		}

}

	
	
	
	
	
	
