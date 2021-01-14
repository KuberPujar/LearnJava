package com.learn.java.challenges;


public class DecimalNumberComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println(areEqualByThreeDecimalPlaces(-3.176,-3.175));
		 System.out.println(hasEqualSum(1, -1, 0));
		 
     System.out.println(hasTeen(9,99,19));
     System.out.println(hasTeen(23,15,42));
     System.out.println(hasTeen(22,23,24));
	}
	 public static boolean areEqualByThreeDecimalPlaces(double one,double two)
	 {
		 
		  int a = (int) one * 1000;
	        int b = (int) two * 1000;
	        System.out.println(a+" "+b);
	        if(a == b){
	            System.out.println(true);
	            return true;
	        }
	        else

	            System.out.println(false);
	        return false;
	 }
	 
	 public static boolean hasEqualSum(int a, int b, int c)
	 {
	     if((a+b)==c)
	     {
	         return true;
	     }
	     else
	     {
	         return false;
	     }
	 }
	 
	 public static boolean hasTeen(int firstNum, int secondNum, int thirdNum){
	        
	        if((firstNum >= 13 && firstNum <= 19) || (secondNum >= 13 && secondNum <= 19) || (thirdNum >= 13 && thirdNum <= 19) ){
	            return true;       
	        } else {
	            return false;
	        }
	 
	    }
	    
	    public static boolean isTeen(int fourthNum){
	        if(fourthNum >= 13 && fourthNum <= 19){
	            return true;
	        } else {
	            return false;
	        }
	    }
	    	 
	
}
