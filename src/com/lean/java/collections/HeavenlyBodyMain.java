package com.lean.java.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HeavenlyBodyMain {
	private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
	private static Set<HeavenlyBody> planets = new HashSet<>();

	public static void main(String[] args) {
		HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		temp = new HeavenlyBody("Venus", 225);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		temp = new HeavenlyBody("Earth", 365);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon);

		temp = new HeavenlyBody("Mars", 687);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		tempMoon = new HeavenlyBody("Deimos", 1.3);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon);

		tempMoon = new HeavenlyBody("Phobos", 0.3);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon);

		temp = new HeavenlyBody("Jupiter", 4332);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		tempMoon = new HeavenlyBody("Io", 1.8);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon);

		tempMoon = new HeavenlyBody("Europa", 3.5);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon);

		tempMoon = new HeavenlyBody("Ganymede", 7.1);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon);

		tempMoon = new HeavenlyBody("Callisto", 16.7);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon);

		temp = new HeavenlyBody("Saturn", 10759);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		temp = new HeavenlyBody("Uranus", 30660);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		temp = new HeavenlyBody("Neptune", 165);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		temp = new HeavenlyBody("Pluto", 248);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		temp = new HeavenlyBody("Pluto", 842);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		System.out.println("Palnets:");
		planets.stream().forEach(s -> {
			System.out.println("\t" + s.getName());
			if (s.getSatellites().size() > 0) {
				System.out.println("\tMoons of " + s.getName());
				s.getSatellites().stream().forEach(p -> {
					System.out.println("\t" + p.getName());
				});
				System.out.println();
			} else {
				System.out.println("\tNo sattelite added in the system for Planet:" + s.getName() + "\n");
			}
		});

		Set<HeavenlyBody> moons = new HashSet<>();
		planets.stream().forEach(s -> {
			moons.addAll(s.getSatellites());
		});

		System.out.println("All Moons::");
		moons.stream().forEach(s -> System.out.println("\t" + s.getName()));

		Object o = new Object();
		o.equals(o);
		"Pluto".equals("");
		
		planets.stream().forEach(s->System.out.println(s.getName()));

	}

}
