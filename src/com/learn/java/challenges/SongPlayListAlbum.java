package com.learn.java.challenges;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class SongPlayListAlbum {
	public static void main(String args[]) {
		/*
		 * ArrayList<Album> albums = new ArrayList<Album>(); Album album = new
		 * Album("Stromebringer", "Deep Purple"); album.addSong("Stromebrnger", 5.23);
		 * album.addSong("Love don't mean a thing", 4.23); album.addSong("Holy man",
		 * 8.56); album.addSong("Hold On", 5.58); album.addSong("The ball shooter",
		 * 6.36); album.addSong("The gypsy", 8.96); albums.add(album);
		 * 
		 * album = new Album("For those about the rock", "AC/DC");
		 * album.addSong("For those about the rock", 5.23);
		 * album.addSong("I putn the finger on you", 4.23); album.addSong("Lets go",
		 * 8.56); album.addSong("Inject the venom", 5.58); album.addSong("Snow balled",
		 * 6.36); album.addSong("Soldier of Fortune", 8.96); albums.add(album);
		 * 
		 * LinkedList<Song> playList = new LinkedList<Song>();
		 * albums.get(0).addToPlayList("Love don't mean a thing", playList);
		 * albums.get(0).addToPlayList("Holy man", playList);
		 * albums.get(0).addToPlayList("The ball shooter", playList);
		 * albums.get(0).addToPlayList(6, playList);
		 * 
		 * albums.get(1).addToPlayList(5, playList); albums.get(1).addToPlayList(3,
		 * playList); albums.get(1).addToPlayList(2, playList);
		 * albums.get(1).addToPlayList(1, playList);
		 */
		
		ArrayList<Album> albums = new ArrayList<>();

		Album album = new Album("Stormbringer", "Deep Purple");
		album.addSong("Stormbringer", 4.6);
		album.addSong("Love don't mean a thing", 4.22);
		album.addSong("Holy man", 4.3);
		album.addSong("Hold on", 5.6);
		album.addSong("Lady double dealer", 3.21);
		album.addSong("You can't do it right", 6.23);
		album.addSong("High ball shooter", 4.27);
		album.addSong("The gypsy", 4.2);
		album.addSong("Soldier of fortune", 3.13);
		albums.add(album);

		album = new Album("For those about to rock", "AC/DC");
		album.addSong("For those about to rock", 5.44);
		album.addSong("I put the finger on you", 3.25);
		album.addSong("Lets go", 3.45);
		album.addSong("Inject the venom", 3.33);
		album.addSong("Snowballed", 4.51);
		album.addSong("Evil walks", 3.45);
		album.addSong("C.O.D.", 5.25);
		album.addSong("Breaking the rules", 5.32);
		album.addSong("Night of the long knives", 5.12);
		albums.add(album);

		LinkedList<Song> playList = new LinkedList<Song>();
		albums.get(0).addToPlayList("You can't do it right", playList);
		albums.get(0).addToPlayList("Holy man", playList);
		albums.get(0).addToPlayList("Speed king", playList);  // Does not exist
		albums.get(0).addToPlayList(9, playList);
		albums.get(1).addToPlayList(3, playList);
		albums.get(1).addToPlayList(2, playList);
		albums.get(1).addToPlayList(24, playList);  // There is no track 24

		play(playList);
	}

	public static void play(LinkedList<Song> playList) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean forword = true;
		ListIterator<Song> listIterator = playList.listIterator();
		if (playList.size() == 0) {
			System.out.println("No songs in the playList");
			return;
		} else {
			System.out.println("Now playing " + listIterator.next().toString());
		}

		while (!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();

			switch (action) {
			case 0:
				System.out.println("PlayList complete.");
				quit = true;
				break;

			case 1:
				if (!forword) {
					if (listIterator.hasNext()) {
						listIterator.next();
					}
					forword = true;
				}

				if (listIterator.hasNext()) {
					System.out.println("Now playing " + listIterator.next().toString());
				} else {
					System.out.println("we have reached end of the playList");
					forword = false;
				}
				break;

			case 2:
				if (forword) {
					if (listIterator.hasPrevious()) {
						listIterator.previous();
					}
					forword = false;
				}
				if (listIterator.hasPrevious()) {
					System.out.println("Now playing " + listIterator.previous().toString());
				} else {
					System.out.println("we are at the start of the playList");
					forword = true;
				}
				break;

			case 3:
				if (forword) {
					if (listIterator.hasPrevious()) {
						System.out.println("Now replaying " + listIterator.previous().toString());
						forword = false;
					} else {
						System.out.println("We are at the start of the list");
					}
				} else {
					if (listIterator.hasNext()) {
						System.out.println("Now replaying " + listIterator.next().toString());
						forword = true;
					} else {
						System.out.println("we have reached the end of the list");
					}
				}
				break;

			case 4:
				printList(playList);
				break;

			case 5:
				printMenu();
				break;

			case 6:
				if (playList.size() > 0) {
					listIterator.remove();
					if (listIterator.hasPrevious()) {
						System.out.println("Now playing " + listIterator.previous().toString());
					} else if (listIterator.hasNext()) {
						System.out.println("Now playing " + listIterator.next().toString());
					}
				}
				break;
			}
		}
	}

	private static void printMenu() {
		System.out.println("Available actions:\npress");
		System.out.println("0 - to quit\n" + "1 - to play next song\n" + "2 - to play previous song\n"
				+ "3 - to replay the current song\n" + "4 - list songs in the playList\n"
				+ "5 - print available actions." + "6 - delete current song from the playList");

	}

	private static void printList(LinkedList<Song> playList) {
		Iterator<Song> iterator = playList.iterator();
		System.out.println("==================================");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("===================================");
	}
}
