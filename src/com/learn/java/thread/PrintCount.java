package com.learn.java.thread;

public class PrintCount {
	public void printCount() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Count::" + i);
		}
	}
}

class ThreadDemo extends Thread {
	private Thread t;
	private String threadName;
	PrintCount printCount;

	public ThreadDemo(String threadName, PrintCount printCount) {
		super();
		this.threadName = threadName;
		this.printCount = printCount;
	}

	@Override
	public  void start() {
		// TODO Auto-generated method stub
		//super.start();
		System.out.println("Starting thread::"+threadName);
		if(t==null)
		{
			t=new Thread(this,threadName);
			t.start();
		}
	}

	@Override
	public void run() {
		synchronized (printCount) {
			printCount.printCount();
		}
		System.out.println("Exiting Thread::"+threadName+"");
		//super.run();
	}

}