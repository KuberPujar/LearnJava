package com.learn.java.challenges;

import java.util.ArrayList;

public class MobilePhone {
	private ArrayList<Contact> contactsArrayList = new ArrayList<Contact>();
	private String myNumber;

	public MobilePhone(String myNumber) {
		this.myNumber = myNumber;
	}

	public MobilePhone() {
	}

	public String getMyNumber() {
		return myNumber;
	}

	public void setMyNumber(String myNumber) {
		this.myNumber = myNumber;
	}

	public static void getContacts() {

	}

	public void printContacts() {
		System.out.println("Conatct List");
		if (this.contactsArrayList.isEmpty()) {
			System.out.println("No contacts to diplay");
		}
		for (int i = 0; i < this.contactsArrayList.size(); i++) {
			System.out.println((i + 1) + "." + this.contactsArrayList.get(i).getName() + "->"
					+ this.contactsArrayList.get(i).getPhoneNumber());
		}
	}

	public boolean addNewContact(Contact contact) {
		if (findContact(contact.getName()) >= 0) {
			System.out.println("Contact already on file");
			return false;
		}
		contactsArrayList.add(contact);
		return true;
	}

	private int findContact(Contact contact) {
		return this.contactsArrayList.indexOf(contact);
	}

	private int findContact(String contactName) {
		for (int i = 0; i < contactsArrayList.size(); i++) {
			Contact contact = this.contactsArrayList.get(i);
			if (contact.getName().equals(contactName)) {
				return i;
			}
		}
		return -1;
	}

	public boolean updateContact(Contact oldContact, Contact newContact) {
		int findPosition = findContact(oldContact);
		if (findPosition < 0) {
			System.out.println(oldContact.getName() + " was not found");
			return false;
		} else if (findContact(newContact.getName()) != -1) {
			System.out.println(
					"Contact with name " + newContact.getName() + " already exists.Update was not successfull");
			return false;
		}
		this.contactsArrayList.set(findPosition, newContact);
		System.out.println(oldContact.getName() + " is replaced by new conatct " + newContact.getName());
		return true;

	}

	public String queryContact(Contact contact) {
		if (findContact(contact) > 0) {
			return contact.getName();
		}
		return null;
	}

	public boolean removeContact(Contact contact) {
		int foundPosition = findContact(contact);
		if (foundPosition < 0) {
			System.out.println(contact.getName() + " not found");
			return false;
		}
		this.contactsArrayList.remove(contact);
		return true;
	}

	public Contact queryContact(String name) {
		int findPosition = findContact(name);
		if (findPosition >= 0) {
			return this.contactsArrayList.get(findPosition);
		}
		return null;
	}

}
