package com.lean.java.multithreading;

class Runner extends Thread {
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

public class ThreadByExtending {

	public static void main(String[] args) {
		Runner runner1 = new Runner();
		runner1.start();

		Runner runner2 = new Runner();
		runner2.start();
	}

}
