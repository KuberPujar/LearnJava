package com.learn.multithreading.java8;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CallableEx {

	public static void main(String[] args) {
		Callable<Integer> task = () -> {
			try {
				TimeUnit.SECONDS.sleep(1);
				return 1234;
			} catch (InterruptedException e) {
				throw new IllegalStateException("Task interupted", e);
			}
		};
		try{
			ExecutorService executor = Executors.newFixedThreadPool(1);
			Future<Integer> feature = executor.submit(task);
			System.out.println("is feature done:" + feature.isDone());
			Integer i = feature.get();
			System.out.println("is feature done:" + feature.isDone());
			System.out.println("result:" + i);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			
		}
	}
}
