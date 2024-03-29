package com.learn.java.polymorpism;

class Movie {
	private String name;

	public Movie(String name) {
		this.name = name;
	}

	public String plot() {
		return "No plot here";
	}

	public String getName() {
		return name;
	}

}

class Jaws extends Movie {

	public Jaws() {
		super("Jaws");
	}

	@Override
	public String plot() {
		return "A shark eats lot of people";
	}
}

class IndependenceDay extends Movie {

	public IndependenceDay() {
		super("IndependenceDay");
	}

	@Override
	public String plot() {
		return "Aliens attack on earth";
	}
}

class MazeRunner extends Movie {

	public MazeRunner() {
		super("MazeRunner");
	}

	@Override
	public String plot() {
		return "Maze runner";
	}
}

class StarWars extends Movie {

	public StarWars() {
		super("StarWars");
	}

	@Override
	public String plot() {
		return "Imperials try to take over universe";
	}
}

class Forgetable extends Movie {

	public Forgetable() {
		super("Forgetable");
	}

	// No plot method
}

public class PolyMorphismEx {

	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			Movie movie = randomeMovie();
			System.out.println("Movie#" + i + " : " + movie.getName() + " \n" + " Plot:" + movie.plot() + "\n");
		}

	}

	public static Movie randomeMovie() {
		int randamNumber = (int) (Math.random() * 5) + 1;
		System.out.println("Random number generated was " + randamNumber);
		switch (randamNumber) {
		case 1:
			return new Jaws();
		case 2:
			return new IndependenceDay();
		case 3:
			return new MazeRunner();
		case 4:
			return new StarWars();
		case 5:
			return new Forgetable();

		}
		return null;
	}
}
