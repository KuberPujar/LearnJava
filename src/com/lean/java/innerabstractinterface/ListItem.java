package com.lean.java.innerabstractinterface;

public abstract class ListItem {
	protected ListItem leftLink;
	protected ListItem rightLink;

	protected Object value;

	public ListItem(Object value) {
		super();
		this.value = value;
	}

	abstract ListItem next();

	abstract ListItem setNext(ListItem item);

	abstract ListItem previous();

	abstract ListItem setPrevious(ListItem item);

	abstract int compareTo(ListItem item);

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

}
