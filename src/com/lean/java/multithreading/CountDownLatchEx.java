package com.lean.java.multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;

class Procesorr implements Runnable {

	private Logger logger = Logger.getLogger(Procesorr.class);
	private CountDownLatch latch;

	public Procesorr(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		NDC.push("Procesorr");
		logger.info("started.....");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			logger.error(e.fillInStackTrace());
		}
		latch.countDown();

	}

}

public class CountDownLatchEx {
	private static Logger logger = Logger.getLogger(CountDownLatchEx.class);

	public static void main(String[] args) {
		NDC.push("CountDownLatchEx");
		CountDownLatch latch = new CountDownLatch(3);
		ExecutorService execuor = Executors.newFixedThreadPool(3);

		for (int i = 0; i < 3; i++) {
			execuor.submit(new Procesorr(latch));
		}
		try {
			latch.await();
		} catch (InterruptedException e) {
			logger.error(e.fillInStackTrace());
		}
		execuor.shutdown();
		logger.info("completed.....");
	}

}
