package com.lean.java.innerabstractinterface;

public class Vehicle {
private String name;
private String type;
private String licensenum;

public Vehicle() {
	super();
}

public Vehicle(String name, String type, String licensenum) {
	super();
	this.name = name;
	this.type = type;
	this.licensenum = licensenum;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
private final String getLicensenum() {
	return licensenum;
}
private final void setLicensenum(String licensenum) {
	this.licensenum = licensenum;
}



}
