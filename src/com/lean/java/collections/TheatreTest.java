package com.lean.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TheatreTest {

	public static void main(String[] args) {
		Theatre theatre = new Theatre("Shiva Shakthi", 8, 12);
		List<Theatre.Seat> seatCopy = new ArrayList<Theatre.Seat>();
		seatCopy.addAll(theatre.getSeats());
		printList(seatCopy);

		seatCopy.get(1).reserve();
		if (theatre.reserveSeat("A01")) {
			System.out.println("Please pay");
		} else {
			System.out.println("Sorry seat is already reserved");
		}

		if (theatre.reserveSeat("A01")) {
			System.out.println("Please pay");
		} else {
			System.out.println("Sorry seat is already reserved");
		}

		Collections.shuffle(seatCopy);
		System.out.println("Printing seat copy::" + "\n");
		printList(seatCopy);
		System.out.println("Printing theatre seats::" + "\n");
		printList(theatre.getSeats());

		Theatre.Seat min = Collections.min(seatCopy);
		Theatre.Seat max = Collections.max(seatCopy);
		System.out.println("Minimum seat number==" + min.getSeatNumber());
		System.out.println("Maximum seat number==" + max.getSeatNumber());
		sortList(seatCopy);
		System.out.println("printing sorted list::");
		printList(seatCopy);
	}

	private static void printList(List<Theatre.Seat> list) {
		for (Theatre.Seat seat : list) {
			System.out.println(" " + seat.getSeatNumber());
		}
	}
	
	private static void sortList(List<? extends Theatre.Seat> list)
	{
		for(int i=0;i<list.size()-1;i++)	
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i).compareTo(list.get(j))>0)
				{
					Collections.swap(list, i, j);
				}
			}
		}
	}

}
