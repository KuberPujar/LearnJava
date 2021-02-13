package com.learn.java.challenges;

import java.util.Scanner;

public class MobileApp {
	private static Scanner scanner = null;
	private static MobilePhone mobilePhone = null;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		mobilePhone=new MobilePhone();
		boolean quit = false;
		startPhne();
		printContactMenu();
		while (!quit) {
			System.out.println("\n Enter Action: (6 to show available actions)");
			int action = scanner.nextInt();
			scanner.nextLine();
			switch (action) {
			case 0:
				System.out.println("\nShutting down....");
				quit = true;
				break;
			case 1:
				mobilePhone.printContacts();
				break;
			case 2:
				addNewContact();
				break;

			case 3:
				updateContact();
				break;

			case 4:
				removeContact();
				break;

			case 5:
				queryContact();
				break;

			case 6:
				printContactMenu();
				break;
			}
		}
	}

	private static void printContactMenu() {
		System.out.println("\nAvailable Actions:\n Press" + "\n" + " 0: to Shutdown" + "\n" + " 1: to print Contact"
				+ "\n" + " 2: to Add an new Contact" + "\n" + " 3: update existing contact as existing contact " + "\n"
				+ " 4: to remove an existing contact" + "\n" + " 5: query if an existing contact exists\n"
				+ " 6: to print a list of available actions");
		System.out.println("Choose Your Action..");
	}

	private static void startPhne() {
		System.out.println("Starting phone.....");
	}

	private static void addNewContact() {
		System.out.println("Enter new Contact name: ");
		String name = scanner.nextLine();
		System.out.println("Enter Phone Number : ");
		String phoneNumber = scanner.nextLine();
		Contact newContact = Contact.createContact(name, phoneNumber);
		if (mobilePhone.addNewContact(newContact)) {
			System.out.println("New Conatct added: name = " + name + " , phone = " + phoneNumber);
		} else {
			System.out.println("Cannot add , " + name + " already on file");
		}
	}

	private static void updateContact() {
		System.out.println("Enter existing contact name: ");
		String name = scanner.nextLine();
		Contact existingContact = mobilePhone.queryContact(name);
		if (existingContact == null) {
			System.out.println("Contact not found");
			return;
		}
		System.out.println("Enter new Contact name: ");
		String newName = scanner.nextLine();
		System.out.println("Enter new Phone number: ");
		String newNumber = scanner.nextLine();
		Contact newContact = Contact.createContact(newName, newNumber);
		mobilePhone.updateContact(existingContact, newContact);
	}

	private static void removeContact() {
		System.out.println("Enter existing contact name: ");
		String name = scanner.nextLine();
		Contact existingContact = mobilePhone.queryContact(name);
		if (existingContact == null) {
			System.out.println("Contract not found");
			return;
		}
		if (mobilePhone.removeContact(existingContact)) {
			System.out.println("Successfully deleted");
		} else {
			System.out.println("Error deleting contact " + name);
		}

	}

	private static void queryContact() {
		System.out.println("Enter existing contact name: ");
		String name = scanner.nextLine();
		Contact existingContact = mobilePhone.queryContact(name);
		if (existingContact == null) {
			System.out.println("Contract not found");
			return;
		}
		System.out.println(
				"Name : " + existingContact.getName() + " phone number is " + existingContact.getPhoneNumber());
	}
}
