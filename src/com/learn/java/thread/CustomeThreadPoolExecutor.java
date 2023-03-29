package com.learn.java.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CustomeThreadPoolExecutor extends ThreadPoolExecutor{

	public CustomeThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit,
			BlockingQueue<Runnable> workQueue) {
		super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void beforeExecute(Thread t, Runnable r) {
		// TODO Auto-generated method stub
		super.beforeExecute(t, r);
		 System.out.println("Perform beforeExecute() logic");
	}

	@Override
	protected void afterExecute(Runnable r, Throwable t) {
		// TODO Auto-generated method stub
		super.afterExecute(r, t);
		if (t != null) {
            System.out.println("Perform exception handler logic");
        }
        System.out.println("Perform afterExecute() logic");
	}

}
