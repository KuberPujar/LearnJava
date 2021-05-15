package com.lean.java.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Theatre {
	private final String theatreName;
	private List<Seat> seats = new LinkedList<>();

	public Theatre(String theatreName, int numRows, int seatsPerRow) {
		super();
		this.theatreName = theatreName;
		int lastRow = 'A' + (numRows - 1);
		for (char row = 'A'; row <= lastRow; row++) {
			for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
				Seat seat = new Seat(row + String.format("%02d", seatNum));
				seats.add(seat);
			}
		}

	}

	public boolean reserveSeat(String seatNo) {
		Seat requestedSeat = new Seat(seatNo);
		int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
		if (foundSeat >= 0) {
			return seats.get(foundSeat).reserve();
		} else {
			System.out.println("There is no seat " + seatNo);
			return false;
		}
		/*
		 * for (Seat seat : seats) { if (seat.getSeatNumber().equals(seatNo)) {
		 * requestedSeat = seat; break; } }
		 * 
		 * if (requestedSeat == null) { System.out.println("There is no seat " +
		 * seatNo); return false; } return requestedSeat.reserve();
		 */
	}

	public String getTheatreName() {
		return theatreName;
	}

	public List<Seat> getSeats() {
		return this.seats;
	}

	public class Seat implements Comparable<Seat> {
		private final String seatNumber;
		private boolean reserved = false;

		public Seat(String seatNumber) {
			super();
			this.seatNumber = seatNumber;
		}

		public String getSeatNumber() {
			return seatNumber;
		}

		public boolean reserve() {
			if (!this.reserved) {
				this.reserved = true;
				System.out.println("Seat number " + seatNumber + " reserved");
				return true;
			} else {
				return false;
			}
		}

		public boolean cancel() {
			if (this.reserved) {
				this.reserved = false;
				System.out.println("Seat number " + seatNumber + " cancelled");
				return true;
			} else {
				return false;
			}
		}

		@Override
		public int compareTo(Seat o) {
			// TODO Auto-generated method stub
			return this.seatNumber.compareTo(o.getSeatNumber());
		}

	}
}
