package com.learn.java.challenges;

public class KmToMh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(toMilesPerHour(95.75));
		printConversion(0);
	}
	public static long toMilesPerHour(double kilometersPerHour)
    {
        long milesPerHour=0L;
        if(kilometersPerHour>0){
            milesPerHour=(long) Math.round((kilometersPerHour/1.609d));
        }
        else
        {
            return -1;
        }
        return milesPerHour;
    }
  
   public static void printConversion(double kilometersPerHour)
    {
        long milesPerHour=0L;
        if(kilometersPerHour>0){
            milesPerHour=(long) Math.round((kilometersPerHour/1.609d));
            System.out.println(kilometersPerHour+" km/h = "+milesPerHour+" mi/h");
        }
        else if(kilometersPerHour==0)
        {
        	milesPerHour=(long) Math.round((kilometersPerHour/1.609d));
        	System.out.println(kilometersPerHour+" km/h = "+milesPerHour+" mi/h");
        }
        else
        {
            System.out.println("Invalid Value");
        }
    }
}
