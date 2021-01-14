package com.learn.java.methodoverloading;

public class SecondsAndMinutesChallenge {

	public static void main(String[] args) {
		System.out.println(getDurationString(65, 45));
		System.out.println(getDurationString(3945));
	}

	public static String getDurationString(int minutes, int seconds) {

		if (minutes >= 0 && (seconds >= 0 && seconds <= 59)) {
			return (getLeadingZeroToTime((((minutes * 60) + seconds) / 60) / 60) + " hr " + getLeadingZeroToTime((((minutes * 60) + seconds) / 60) % 60)
					+ " min " + getLeadingZeroToTime(((minutes * 60) + seconds) % 60)) + " ss";
		} else {
			return "Invalid Value";
		}
	}
	
	public static String getDurationString(int seconds) {

		if (seconds >= 0) {
			return getDurationString((seconds/ 60),((seconds/60)% 60));
		} else {
			return "Invalid Value";
		}
	}
	
	public static String getLeadingZeroToTime(int time)
	{
		String msg=null;
		if(time<10)
		{
			msg= "0"+time;
		}
		else
		{
			msg=""+time;
		}
		return msg;
	}
}
