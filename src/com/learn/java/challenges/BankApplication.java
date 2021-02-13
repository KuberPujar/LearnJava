package com.learn.java.challenges;

public class BankApplication {

	public static void main(String[] args) {
		Bank bank = new Bank("State Bank Of India");
		bank.addBranch("Karjagi Building");
		bank.addCustomer("Karjagi Building", "kuber", 1000);
		bank.addCustomerTransaction("Karjagi Building", "kuber", 2000);
		bank.addCustomer("Karjagi Building", "Shahsi", 2500);
		bank.addCustomerTransaction("Karjagi Building", "Shahsi", 2000);
		bank.addCustomer("Karjagi Building", "Jello", 3500);
		bank.addCustomerTransaction("Karjagi Building", "Jello", 2000);

		bank.addBranch("ADB road");
		bank.addCustomer("ADB road", "john", 500);
		bank.addCustomerTransaction("ADB road", "john", 2000);
		bank.addCustomer("ADB road", "Chenna", 2500);
		bank.addCustomerTransaction("ADB road", "Chenna", 2000);
		bank.addCustomer("ADB road", "Chikku", 3500);
		bank.addCustomerTransaction("ADB road", "Chikku", 2000);

		bank.addBranch("PB Road");
		bank.addCustomer("PB Road", "chandra", 10000);
		bank.addCustomerTransaction("PB Road", "chandra", 2000);
		bank.addCustomer("PB Road", "bhima", 25500);
		bank.addCustomerTransaction("PB Road", "bhima", 2000);
		bank.addCustomer("PB Road", "sikka", 39500);
		bank.addCustomerTransaction("PB Road", "sikka", 2000);

		bank.listCustomers("Karjagi Building", true);
		bank.listCustomers("ADB road", true);
		bank.listCustomers("PB Road", true);
		
		Bank bank1 = new Bank("National Australia Bank");

		bank1.addBranch("Adelaide");

		bank1.addCustomer("Adelaide", "Tim", 50.05);
		bank1.addCustomer("Adelaide", "Mike", 175.34);
		bank1.addCustomer("Adelaide", "Percy", 220.12);

		bank1.addCustomerTransaction("Adelaide", "Tim", 44.22);
		bank1.addCustomerTransaction("Adelaide", "Tim", 12.44);
		bank1.addCustomerTransaction("Adelaide", "Mike", 1.65);

		bank1.listCustomers("Adelaide", false);
	}

}
