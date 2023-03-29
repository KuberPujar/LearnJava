package com.learn.java.challenges;

import java.util.ArrayList;

public class Bank {
	private String name;
	private ArrayList<Branch> branches;

	public Bank(String name) {
		this.name = name;
		this.branches = new ArrayList<Branch>();
	}

	private Branch findBranch(String branchName) {
		for (int i = 0; i < this.branches.size(); i++) {
			if (this.branches.get(i).getName().equalsIgnoreCase(branchName)) {
				return this.branches.get(i);
			}
		}
		return null;
	}

	public boolean addBranch(String branchName) {
		if (findBranch(branchName) == null) {
			this.branches.add(new Branch(branchName));
			return true;
		}
		return false;
	}

	public boolean addCustomer(String branchName, String custometName, double initialAmount) {
		Branch branch = findBranch(branchName);
		if (branch != null) {
			return branch.newCustomer(custometName, initialAmount);
		}
		return false;
	}

	public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
		Branch branch = findBranch(branchName);
		if (branch != null) {
			return branch.addCustomerTransaction(customerName, amount);
		}
		return false;
	}

	public boolean listCustomers(String branchName, boolean showTransactions) {
		Branch branch = findBranch(branchName);
		if (branch != null) {
			System.out.println("Customer details of branch " + branch.getName());
			ArrayList<Customer> customers = branch.getCustomers();
			for (int i = 0; i < customers.size(); i++) {
				System.out.println("Customer: " + customers.get(i).getName() + "[" + (i + 1) + "]");
				if (showTransactions) {
					System.out.println("Transactions");
					for (int j = 0; j < customers.get(i).getTransactions().size(); j++) {
						System.out.println("[" + (j + 1) + "] Amount " + customers.get(i).getTransactions().get(j));
					}
				}
			}
			return true;
		} else {
			return false;
		}
	}

}
