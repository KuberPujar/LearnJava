package com.lean.java.collections;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {
	private final Key key;
	private final double orbitalPeriod;
	private final Set<HeavenlyBody> satellites;

	public enum BodyTypes {
		STAR, PLANET, DWARF_PLANET, MOON, COMET, ASTROID
	}

	public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
		super();
		this.orbitalPeriod = orbitalPeriod;
		this.satellites = new HashSet<>();
		this.key = new Key(name, bodyType);
	}

	public double getOrbitalPeriod() {
		return orbitalPeriod;
	}

	public Set<HeavenlyBody> getSatellites() {
		return new HashSet<>(satellites);
	}

	public boolean addSatellite(HeavenlyBody moon) {
		return this.satellites.add(moon);
	}

	public static Key makeKey(String name, BodyTypes bodyType) {
		return new Key(name, bodyType);
	}

	public Key getKey() {
		return key;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj instanceof HeavenlyBody) {
			var heavenlyBody = (HeavenlyBody) obj;
			return this.key.name == heavenlyBody.key.getName();
		}

		return false;
	}

	@Override
	public int hashCode() {
		return this.key.hashCode();
	}

	@Override
	public String toString() {
		return this.key.getName() + ":" + this.key.getBodyType() + ", " + this.orbitalPeriod;
	}

	public static final class Key {
		private final String name;
		private final BodyTypes bodyType;

		private Key(String name, BodyTypes bodyType) {
			super();
			this.name = name;
			this.bodyType = bodyType;
		}

		public String getName() {
			return name;
		}

		public BodyTypes getBodyType() {
			return bodyType;
		}

		@Override
		public int hashCode() {
			return this.name.hashCode() + 57 + this.bodyType.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			Key keyObj = (Key) obj;
			if (keyObj != null && keyObj.getName().equals(this.name)) {
				return this.bodyType == keyObj.getBodyType();
			}
			return false;
		}

	}
}
