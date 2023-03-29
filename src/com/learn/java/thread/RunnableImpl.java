package com.learn.java.thread;

public class RunnableImpl implements Runnable{

	@Override
	public void run() {
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
