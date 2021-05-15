package com.learn.java.thread;

public class Test {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		/*
		 * DemoTask t = new DemoTask("Kuber"); t.run();
		 * 
		 * ThreadExtend t2 = new ThreadExtend(); t2.start();
		 * 
		 * for (int i = 0; i < 10; i++) { Thread tt = new Thread(new RunnableImpl());
		 * tt.start(); }
		 */
		
		PrintCount pc=new PrintCount();
		ThreadDemo d1=new ThreadDemo("Theard-1", pc);
		ThreadDemo d2=new ThreadDemo("Thread-2", pc);
		
		d1.start();
		d2.start();
		
		try
		{
			d1.join();
			d2.join();
		}
		catch(Exception e)
		{
			System.out.println(e.getLocalizedMessage());
		}
	}

}
