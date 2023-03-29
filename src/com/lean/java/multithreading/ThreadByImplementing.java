package com.lean.java.multithreading;

class RunnerThread implements Runnable {

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

}

public class ThreadByImplementing {

	public static void main(String[] args) {
		Thread t1 = new Thread(new RunnerThread());
		Thread t2 = new Thread(new RunnerThread());
		t1.start();
		t2.start();
	}

}
