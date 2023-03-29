package com.learn.java.thread;

public class DemoTask implements Runnable{
private String name;


	public DemoTask(String name) {
	super();
	this.name = name;
}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			Thread.sleep(5000);
			System.out.println(this.name);
		}
		catch(InterruptedException e)
		{
			System.out.println(e.getLocalizedMessage());
		}
	}

}
