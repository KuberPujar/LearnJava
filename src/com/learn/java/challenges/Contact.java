package com.learn.java.challenges;

public class Contact {
	private String name;
	private String phoneNumber;

	public Contact() {
		super();
	}

	public Contact(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public static Contact createContact(String name, String phoneNumber) {
		return new Contact(name, phoneNumber);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
