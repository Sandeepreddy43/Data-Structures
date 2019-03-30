package com.data_structure;

public class DoubleLinkedListDemo {
	NodeDouble head, current = null;

	public void add(int data) {
		NodeDouble n = new NodeDouble();
		n.data = data;
		if (head == null) {
			head = n;
			current = n;
		} else {
			current.nextNode = n;
			n.previosNode = current;
			current = n;
		}
	}

	public void removeStack() {
		NodeDouble n = current;
		current = n.previosNode;
		current.nextNode = null;
	}

	public void removeQueue() {
		NodeDouble n = head;
		head = n.nextNode;
	}

	public void display() {
		NodeDouble n = head;
		System.out.println("L list - Given Order: ");
		while (n != null) {
			System.out.println(n.data);
			n = n.nextNode;
		}
	}
	public void displayReverseOrder() {
		NodeDouble n=current;
		System.out.println("L List - Reverse Oder: ");
		while(n!=null) {
			System.out.println(n.data);
			n=n.previosNode;
		}
	}
}
