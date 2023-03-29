package com.learn.java.generics;

public class Main {
	public static void main(String args[]) {

		League<Team<FootballPlayer>> footBallLeague=new League<Team<FootballPlayer>>("AFL");
		Team<FootballPlayer> adelaideCrows=new Team<FootballPlayer>("Adelaide Crows");
		Team<FootballPlayer> melbourne=new Team<FootballPlayer>("Melbourne");
		Team<FootballPlayer> hawtharn=new Team<FootballPlayer>("Hawtharn");
		Team<FootballPlayer> chicagoCubs=new Team<FootballPlayer>("Chicago Cubs");
		
		hawtharn.matchResult(chicagoCubs, 1, 0);
		hawtharn.matchResult(adelaideCrows, 3, 8);
		adelaideCrows.matchResult(melbourne, 2, 1);
		footBallLeague.add(adelaideCrows);
		footBallLeague.add(melbourne);
		footBallLeague.add(hawtharn);
		footBallLeague.add(chicagoCubs);
		
		footBallLeague.showLeagueTable();
		
		
	}
}
