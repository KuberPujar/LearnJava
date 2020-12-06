package com.lean.java.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;

public class MultipleLocksUsingSyn {

	private final static Logger logger = Logger.getLogger(MultipleLocksUsingSyn.class);
	private Random random = new Random();
	private Object lock1=new Object();
	private Object lock2=new Object();
	private List<Integer> list1 = new ArrayList<Integer>();
	private List<Integer> list2 = new ArrayList<Integer>();

	public  void stageOne() {
		synchronized(lock1)
		{
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
				logger.debug("error::" + e.getStackTrace());
			}
			list1.add(random.nextInt());
		}
		
	}

	public  void stageTwo() {
		synchronized(lock2) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
				logger.debug("error::" + e.getStackTrace());
			}
			list2.add(random.nextInt());	
		}
		
	}

	public void process() {
		for (int i = 0; i < 1000; i++) {
			stageOne();
			stageTwo();
		}
	}

	public static void main(String[] args) {
		NDC.push("Kuber");
		logger.info("starting.............");
		long start = System.currentTimeMillis();
		MultipleLocksUsingSyn p = new MultipleLocksUsingSyn();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				p.process();
			}
		});


		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				p.process();
			}
		});
		
		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			logger.debug("error::" + e.getStackTrace());
		}

		long end = System.currentTimeMillis();
		logger.info("Time taken to process the request:::" + (end - start));
		logger.info("list1::" + p.list1.size() + " list2::" + p.list2.size());
	}

}
