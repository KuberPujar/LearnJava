package com.learn.java.challenges;

public class MaxSumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrp[] = { 1, 5, 7 };
		int sum = 0;
		for (int i = 0; i < arrp.length; i++) {
			sum = sum + arrp[i];
			if(sum>=6)
			{
				bin(sum, 2);
			}
			
		}

	}

	static int rightRotate(int n, int d) {
		final int INT_BITS = 32;
		/*
		 * In n>>d, first d bits are 0. To put last 3 bits of at first, do bitwise or of
		 * n>>d with n <<(INT_BITS - d)
		 */
		return (n << d) | (n >> (INT_BITS - d));
	}

	static void bin(long n) {
		long i;
		StringBuilder sb = new StringBuilder();
		sb.append("0");
		for (i = 1 << 30; i > 0; i = i / 2) {
			if ((n & i) != 0) {
				sb.append("1");
			} else {
				sb.append("0");
			}
		}
		System.out.println(sb.toString());
	}

	static void bin(long n, int numOfShift) {
		long i;
		StringBuilder sb = new StringBuilder();
		sb.append("0");
		for (i = 1 << 30; i > 0; i = i / 2) {
			if ((n & i) != 0) {
				sb.append("1");
			} else {
				sb.append("0");
			}
		}
		System.out.println(sb.toString());
		int charAtt = 31;
		int charReplace = 0;
		// 00000000000000000000000000001101
		for (int j = 0; j < numOfShift; j++) {
			sb.setCharAt(charReplace, sb.charAt(charAtt));
			sb.setCharAt(charAtt, '0');
			charAtt--;
			charReplace++;
		}
		System.out.println(sb.toString());
		System.out.println(Long.parseLong(sb.toString(), 2));
		// 2684354568
		// 1073741827
	}
}
