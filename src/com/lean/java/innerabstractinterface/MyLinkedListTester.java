package com.lean.java.innerabstractinterface;

public class MyLinkedListTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList list = new MyLinkedList(null);
		list.traverse(list.getRoot());

		String cities = "5 7 8 9 6 3 2 1 5 4 7 8";
		String[] ss = cities.split(" ");
		for (String s : ss) {
			list.addItem(new Node(s));
		}
		list.removeItem(new Node(8));
		list.traverse(list.getRoot());
	}

}
