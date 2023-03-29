package com.learn.java.thread;

public class ThreadExtend extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		try
		{
			System.out.println("Thead "+Thread.currentThread().getName()+" started");
		}
		catch(Exception e)
		{
			System.out.println(e.getLocalizedMessage());
		}
	}

}
