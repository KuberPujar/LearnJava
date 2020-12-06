package com.lean.java.multithreading;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;

public class SynchronizeThreads {
	private static final Logger logger = org.apache.log4j.Logger.getLogger(SynchronizeThreads.class.getName());
	private int count = 0;

	public static void main(String[] args) {
		SynchronizeThreads t = new SynchronizeThreads();
		try {
			t.doWork();
		} catch (Exception e) {
			logger.error(e.fillInStackTrace());
		}

	}

	public void doWork() throws InterruptedException {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					increament();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000l; i++) {
					increament();
				}
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		NDC.push("Aparajita ");
		logger.info("count::" + count);
		logger.debug("tester");
	}

	public synchronized void increament() {
		count++;
	}
}
