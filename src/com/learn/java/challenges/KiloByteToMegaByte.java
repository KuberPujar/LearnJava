package com.learn.java.challenges;

public class KiloByteToMegaByte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMegaBytesAndKiloBytes(2500);
	}

	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		if (kiloBytes > 0) {
			int megaByte = kiloBytes / 1024;
			int remainingKiloBytes = kiloBytes % 1024;
			System.out.println(kiloBytes + " KB = " + megaByte + " MB and " + remainingKiloBytes + " KB");
		} else {
			System.out.println("Invalid Value");
		}
	}
}
