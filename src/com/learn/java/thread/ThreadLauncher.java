package com.learn.java.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class ThreadLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService service = Executors.newFixedThreadPool(10);
		IntStream.range(0, 100).forEach(i -> service.submit(new Task(i)));
	}

}

final class Task implements Runnable {
	private int taskId;

	public Task(int taskId) {
		super();
		this.taskId = taskId;
	}

	@Override
	public void run() {
		System.out.println("Task id::" + this.taskId + " perfomed by " + Thread.currentThread().getName());
	}

}