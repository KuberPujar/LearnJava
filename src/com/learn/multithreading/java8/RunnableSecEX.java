package com.learn.multithreading.java8;

import java.util.concurrent.TimeUnit;

public class RunnableSecEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable task = () -> {
			String threadName = Thread.currentThread().getName();
			System.out.println("foo " + threadName);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		};
		task.run();
		Thread thread = new Thread(task);
		thread.start();
	}

}
