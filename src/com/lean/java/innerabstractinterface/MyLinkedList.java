package com.lean.java.innerabstractinterface;

public class MyLinkedList implements NodeList {
	private ListItem root = null;

	public MyLinkedList(ListItem root) {
		super();
		this.root = root;
	}

	@Override
	public ListItem getRoot() {
		return this.root;
	}

	@Override
	public boolean addItem(ListItem newItem) {
		if (this.root == null) {
			// The list was empty, so this item becomes the head of the list.
			this.root = newItem;
			return true;
		}

		ListItem currentItem = this.root;
		while (currentItem != null) {
			int comparison = currentItem.compareTo(newItem);
			if (comparison < 0) {
				// newItem is greater, move right if possible.
				if (currentItem.next() != null) {
					currentItem = currentItem.next();
				} else {
					// there is no next, so insert it at the end of list.
					currentItem.setNext(newItem);
					newItem.setPrevious(currentItem);
				}
				return true;
			} else if (comparison > 0) {
				// then new item is less, insert before it
				if (currentItem.previous() != null) {
					currentItem.previous().setPrevious(newItem).setPrevious(currentItem.previous());
					newItem.setNext(currentItem).setPrevious(newItem);
				} else {
					// the node with previous is root
					newItem.setNext(this.root).setPrevious(newItem);
					this.root = newItem;
				}
				return true;
			} else {
				// equal
				System.out.println(newItem.getValue() + " is already present, not added.");
				return false;
			}
		}
		return false;
	}

	@Override
	public boolean removeItem(ListItem item) {
		if(item!=null)
		{
			System.out.println("Deleting item "+ item.getValue());
		}
		
		ListItem currentItem=this.root;
		while(currentItem!=null)
		{
			int comparison=currentItem.compareTo(item);
			if(comparison==0)
			{
				//found the item to delete
				if(currentItem==this.root)
				{
					this.root=currentItem.next();
				}
				else
				{
					currentItem.previous().setNext(currentItem.next());
					if(currentItem.next()!=null)
					{
						currentItem.next().setPrevious(currentItem.previous());
					}
				}
				return true;
			}
			else if(comparison<0)
			{
				currentItem=currentItem.next();
			}
			else
			{
				//comparision >0
				//We are at an item greater than the one to be deleted
				//so the item is not the list
				return false;
			}
		}
		return false;
	}

	@Override
	public void traverse(ListItem root) {
		if (root == null) {
			System.out.println("The list is empty");
		} else {
			while (root != null) {
				System.out.println(root.getValue());
				root = root.next();
			}
		}
	}

}
