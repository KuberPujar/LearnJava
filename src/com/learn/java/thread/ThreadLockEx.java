package com.learn.java.thread;

public class ThreadLockEx {
	public static Object lock1 = new Object();
	public static Object lock2 = new Object();

	public static void main(String[] args) {
		ThreadDemo1 d1 = new ThreadDemo1();
		ThreadDemo2 d2 = new ThreadDemo2();
		d1.start();
		d2.start();
	}

	private static class ThreadDemo1 extends Thread {

		@Override
		public void run() {
			synchronized (lock1) {
				System.out.println("Thread 1 holding Lock1...");
				try {
					Thread.sleep(10);
				} catch (Exception e) {
					System.out.println(e.getLocalizedMessage());
				}
				System.out.println("Thead 1 waiting for lock 2...");
				synchronized (lock2) {
					System.out.println("Thread 1 holding lock1 and lock2...");
				}
			}
		}

	}

	private static class ThreadDemo2 extends Thread {

		@Override
		public void run() {
			synchronized (lock2) {
				System.out.println("Thread 2 holding lock 2....");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					System.out.println(e.getLocalizedMessage());
				}
				System.out.println("Thread 2 waiting for lock1..");

				synchronized (lock1) {
					System.out.println("Thread 2 holding both lock2 and lock1");
				}
			}
		}

	}
}