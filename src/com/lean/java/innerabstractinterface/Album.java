package com.lean.java.innerabstractinterface;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
	private String name;
	private String artist;
	private SongList songs;

	public Album(String name, String artist) {
		super();
		this.name = name;
		this.artist = artist;
		this.songs = new SongList();
	}

	/*
	 * private Song findSong(String title) { for (Song checkedSong :
	 * this.songs.songs) { if (checkedSong.getTitle().equalsIgnoreCase(title)) {
	 * return checkedSong; } } return null; }
	 */

	public boolean addSong(String title, double duration) {
		if (this.songs.findSong(title) == null) {
			this.songs.add(new Song(title, duration));
			return true;
		}
		return false;
	}

	public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
		int index = trackNumber - 1;
		if ((index >= 0) && (index <= this.songs.songs.size())) {
			playList.add(this.songs.songs.get(index));
			return true;
		}
		System.out.println("This album doesn't have trackNuber " + trackNumber);
		return false;
	}

	public boolean addToPlayList(String title, LinkedList<Song> playList) {
		Song checkedSong = this.songs.findSong(title);
		if (checkedSong != null) {
			playList.add(checkedSong);
			return true;
		}
		System.out.println("The Song " + title + " is not in this album");
		return false;
	}

	private class SongList {
		private ArrayList<Song> songs;

		public SongList() {
			this.songs = new ArrayList<Song>();
		}

		public boolean add(Song song) {
			if (findSong(song.getTitle()) == null) {
				this.songs.add(song);
				return true;
			}
			return false;
		}

		public Song findSong(String title) {
			for (Song song : this.songs) {
				if (song.getTitle().equalsIgnoreCase(title)) {
					return song;
				}
			}
			return null;
		}

		public Song findSong(int trackNumber) {
			if (this.songs.get(trackNumber) != null) {
				return this.songs.get(trackNumber);
			}
			return null;
		}
	}
}
