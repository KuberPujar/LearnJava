package com.lean.java.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HeavenlyBodyMain {
	private static Map<HeavenlyBody.Key, HeavenlyBody> solarSystem = new HashMap<>();
	private static Set<HeavenlyBody> planets = new HashSet<>();

	public static void main(String[] args) {
		HeavenlyBody temp = new Planet("Mercury", 88);
		solarSystem.put(temp.getKey(), temp);
		planets.add(temp);

		temp = new Planet("Venus", 225);
		solarSystem.put(temp.getKey(), temp);
		planets.add(temp);

		temp = new Planet("Earth", 365);
		solarSystem.put(temp.getKey(), temp);
		planets.add(temp);

		HeavenlyBody tempMoon = new Moon("Moon", 27);
		solarSystem.put(temp.getKey(), tempMoon);
		temp.addSatellite(tempMoon);

		temp = new Planet("Mars", 687);
		solarSystem.put(temp.getKey(), temp);
		planets.add(temp);

		tempMoon = new Moon("Deimos", 1.3);
		solarSystem.put(temp.getKey(), tempMoon);
		temp.addSatellite(tempMoon);

		tempMoon = new Moon("Phobos", 0.3);
		solarSystem.put(temp.getKey(), tempMoon);
		temp.addSatellite(tempMoon);

		temp = new Planet("Jupiter", 4332);
		solarSystem.put(temp.getKey(), temp);
		planets.add(temp);

		tempMoon = new Moon("Io", 1.8);
		solarSystem.put(temp.getKey(), tempMoon);
		temp.addSatellite(tempMoon);

		tempMoon = new Moon("Europa", 3.5);
		solarSystem.put(temp.getKey(), tempMoon);
		temp.addSatellite(tempMoon);

		tempMoon = new Moon("Ganymede", 7.1);
		solarSystem.put(temp.getKey(), tempMoon);
		temp.addSatellite(tempMoon);

		tempMoon = new Moon("Callisto", 16.7);
		solarSystem.put(temp.getKey(), tempMoon);
		temp.addSatellite(tempMoon);

		temp = new Planet("Saturn", 10759);
		solarSystem.put(temp.getKey(), temp);
		planets.add(temp);

		temp = new Planet("Uranus", 30660);
		solarSystem.put(temp.getKey(), temp);
		planets.add(temp);

		temp = new Planet("Neptune", 165);
		solarSystem.put(temp.getKey(), temp);
		planets.add(temp);

		temp = new Planet("Pluto", 248);
		solarSystem.put(temp.getKey(), temp);
		planets.add(temp);

		HeavenlyBody pluto = new DwarfPlanet("Pluto", 842);
		solarSystem.put(temp.getKey(), temp);
		planets.add(temp);

		System.out.println("Palnets:");
		planets.stream().forEach(s -> {
			System.out.println("\t" + s.getKey().getName());
			if (s.getSatellites().size() > 0) {
				System.out.println("\tMoons of " + s.getKey().getName());
				s.getSatellites().stream().forEach(p -> {
					System.out.println("\t" + p.getKey().getName());
				});
				System.out.println();
			} else {
				System.out.println("\tNo sattelite added in the system for Planet:" + s.getKey().getName() + "\n");
			}
		});

		Set<HeavenlyBody> moons = new HashSet<>();
		planets.stream().forEach(s -> {
			moons.addAll(s.getSatellites());
		});

		System.out.println("All Moons::");
		moons.stream().forEach(s -> System.out.println("\t" + s.getKey().getName()));

		/*Object o = new Object();
		o.equals(o);
		"Pluto".equals("");*/
		
		planets.stream().forEach(System.out::println);

		//symmetric tests
		HeavenlyBody earth1=new Planet("Earth", 365);
		HeavenlyBody earth2=new Planet("Earth", 365);
		System.out.println(earth1.equals(earth2));
		System.out.println(earth2.equals(earth1));
		System.out.println(pluto.equals(earth2));
		System.out.println(earth2.equals(pluto));
		
		solarSystem.put(pluto.getKey(), pluto);
		System.out.println(solarSystem.get(HeavenlyBody.makeKey("Pluto", HeavenlyBody.BodyTypes.PLANET)));
		System.out.println(solarSystem.get(HeavenlyBody.makeKey("Pluto", HeavenlyBody.BodyTypes.DWARF_PLANET)));
	}

}
