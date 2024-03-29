package com.learn.java.challenges;

public class Song {
	private String title;
	private double duration;

	public Song(String title, double duration) {
		super();
		this.title = title;
		this.duration = duration;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return title + ": " + duration;
	}

}
