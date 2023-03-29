package com.lean.java.multithreading;

import java.util.Scanner;

class Processor extends Thread
{
	private volatile boolean running=true;
	public void run()
	{
		while(running)
		{
			System.out.println("Hello");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void shutdown()
	{
		running=false;
	}
}

public class VolatileKeyUsageForTerminatingThread {

	public static void main(String[] args) {
    Processor p1=new Processor();
    p1.start();
    System.out.println("Press return to stop...................................");
    @SuppressWarnings("resource")
	Scanner scan=new Scanner(System.in);
    scan.nextLine();
    p1.shutdown();
	}

}
