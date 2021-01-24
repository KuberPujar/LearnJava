package com.lean.java.multithreading;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import org.apache.log4j.Logger;

public class ProducerConsumer {
	private static ArrayBlockingQueue<Integer> bqueue = new ArrayBlockingQueue<Integer>(10);
	@SuppressWarnings("unused")
	private static final Logger logger = Logger.getLogger(ProducerConsumer.class);

	public static void main(String[] args) throws InterruptedException {
		 Thread t1 = new Thread(new Runnable() {
	            public void run() {
	                try {
	                    producer();
	                } catch (InterruptedException ignored) {}
	            }
	        });

	        Thread t2 = new Thread(new Runnable() {
	            public void run() {
	                try {
	                    consumer();
	                } catch (InterruptedException ignored) {}
	            }
	        });
	        t1.start();
	        t2.start();
//	        t1.join();
//	        t2.join();

	        // Pause for 30 seconds and force quitting the app (because we're
	        // looping infinitely)
	        Thread.sleep(30000);
	        System.exit(0);
	    }

	    private static void producer() throws InterruptedException {
	        Random random = new Random();
	        while (true) {//loop indefinitely
	        	bqueue.put(random.nextInt(100));//if queue is full (10) waits
	        }
	    }

	    private static void consumer() throws InterruptedException {
	        Random random = new Random();
	        while (true) {
	            Thread.sleep(100);
	            if (random.nextInt(10) == 0) {
	                Integer value = bqueue.take();//if queue is empty waits
	                System.out.println("Taken value: " + value + "; Queue size is: " + bqueue.size());
	            }
	        }
	    }
}
