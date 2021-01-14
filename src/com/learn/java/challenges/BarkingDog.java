package com.learn.java.challenges;

public class BarkingDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(shouldWakeUp(true, 7));
     System.out.println(shouldWakeUp(true, 0));
     System.out.println(shouldWakeUp(true, 44));
     System.out.println(shouldWakeUp(true, 23));
     System.out.println(shouldWakeUp(true, -1));
     System.out.println(shouldWakeUp(false, 8));
     System.out.println(shouldWakeUp(false, 0));
	}

    public static boolean shouldWakeUp(boolean barking, int hourOfDay)
    {
        if(barking==true && ((hourOfDay>=0 && hourOfDay<8) || (hourOfDay>22 && hourOfDay<=23)))
        {
            return true;
        }
        else if(barking==false && (hourOfDay<0 || hourOfDay>23))
        {
            return false;
        }
        else
        {
            return false;
        }
    }
}
