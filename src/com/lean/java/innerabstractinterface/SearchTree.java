package com.lean.java.innerabstractinterface;

public class SearchTree implements NodeList {

	private ListItem root = null;

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
					return true;
				}
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
		if (item != null) {
			System.out.println("Delegating item " + item.getValue());
		}
		ListItem curreItem = this.root;
		ListItem parentItem = curreItem;
		while (curreItem != null) {
			int comparision = curreItem.compareTo(item);
			if (comparision < 0) {
				parentItem = curreItem;
				curreItem = curreItem.next();
			} else if (comparision > 0) {
				parentItem = curreItem;
				curreItem = curreItem.previous();
			} else {
				// equal we have found the item..remove it.
				performRemoval(curreItem, parentItem);
				return true;
			}
		}
		return false;
	}

	private void performRemoval(ListItem item, ListItem parentItem) {
		// remove it from the tree
		if (item.next() == null) {
			// no right tree, so make parent point to left tree (which may be null)
			if (parentItem.next() == item) {
				// item is right child of its parent
				parentItem.setNext(item.previous());
			} else if (parentItem.previous() == item) {
				// item is left child of parent
				parentItem.setPrevious(item.previous());
			} else {
				// parent must be item, which means we were looking at the root of the tree
				this.root = item.previous();
			}
		} else if (item.previous() == null) {
			// no left tree, so make parent point to the right tree (which may be null)
			if (parentItem.next() == item) {
				// item is right child of its parent
				parentItem.setNext(item.next());
			} else if (parentItem.previous() == item) {
				// item is left child of its parent
				parentItem.setPrevious(item.next());
			} else {
				// again we are deleting the root
				this.root = item.next();
			}
		} else {
			// neither left nor right tree are null, deletion is now a lot more trickier!!!
			// from the right sub-tree, find the smallest value(i.e, leftmost).
			ListItem current = item.next();
			ListItem leftMostParent = item;
			while (current.previous() != null) {
				leftMostParent = current;
				current = current.previous();
			}
			// Now put the smallest value into our node to be deleted
			item.setValue(current.getValue());
			// and delete the smallest
			if (leftMostParent == item) {
				// there was no left most node, so 'current' points to the smallest node
				// (that one that must now deleted)
				item.setNext(current.next());
			} else {
				// set the smallest node's parent to point to
				// the smallest node's right child(which may be null)
				leftMostParent.setPrevious(current.next());
			}
		}
	}

	@Override
	public void traverse(ListItem root) {
		// recursive method
		if (root != null) {
			// traverse(root.previous());
			System.out.println(root.getValue());
			traverse(root.next());
		}
	}

}
