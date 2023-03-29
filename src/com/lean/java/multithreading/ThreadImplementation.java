package com.lean.java.multithreading;

public class ThreadImplementation {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {

				int count = 0;
				for (int i = 0; i < 10; i++) {
					count = count + i;
					System.out.println(count);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			
			}
		});
		
		t1.start();
	}
}