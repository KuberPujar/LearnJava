package com.lean.java.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

class Processr implements Runnable {
	private Logger logger = Logger.getLogger(Processr.class);
	private int id;

	public Processr(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		logger.info("Threads Started......");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			logger.error(e.fillInStackTrace());
		}
		logger.info("completed::"+id);
	}

}

public class ThreadPoolEx {
	private static Logger logger = Logger.getLogger(ThreadPoolEx.class);

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);

		for (int i = 0; i < 5; i++) {
			executor.submit(new Processr(i));
		}
		executor.shutdown();
		logger.info("All tasks are submitted..");
		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			logger.error(e.fillInStackTrace());
		}
		logger.info("All tasks are completed..");
	}

}
