package com.learn.java.challenges;

public class PaintJob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
	}

	public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
		double area = 0;
		int paintBucketNeeded = -1;
		if (width > 0 && height > 0 && areaPerBucket > 0 && extraBuckets >= 0) {
			area = width * height;
			double paintBaucket = area / areaPerBucket;
			paintBucketNeeded = (int) Math.ceil(paintBaucket) - extraBuckets;
		}
		return paintBucketNeeded;
	}

	public static int getBucketCount(double width, double height, double areaPerBucket) {
		double area = 0;
		int paintBucketNeeded = -1;
		if (width > 0 && height > 0 && areaPerBucket > 0) {
			area = width * height;
			double paintBaucket = area / areaPerBucket;
			paintBucketNeeded = (int) Math.ceil(paintBaucket);
		}
		return paintBucketNeeded;
	}

	public static int getBucketCount(double area, double areaPerBucket) {
		int paintBucketNeeded = -1;
		if (area > 0 && areaPerBucket > 0) {
			double paintBaucket = area / areaPerBucket;
			paintBucketNeeded = (int) Math.ceil(paintBaucket);
		}
		return paintBucketNeeded;
	}
}
