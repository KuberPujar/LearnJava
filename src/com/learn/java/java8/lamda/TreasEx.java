package com.learn.java.java8.lamda;

import java.util.stream.IntStream;

public class TreasEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream instream="12345_dfaadfaa".chars();
		instream.forEach(p->System.out.println("chars"+p));
	}

}
