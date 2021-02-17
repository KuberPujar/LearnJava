package com.lean.java.innerabstractinterface;

public class SearchTree implements NodeList{

	private ListItem root=null;
	
	public SearchTree(ListItem root) {
		super();
		this.root = root;
	}

	@Override
	public ListItem getRoot() {
		// TODO Auto-generated method stub
		return this.root;
	}

	@Override
	public boolean addItem(ListItem item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeItem(ListItem item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void traverse(ListItem root) {
		// TODO Auto-generated method stub
		
	}

}
