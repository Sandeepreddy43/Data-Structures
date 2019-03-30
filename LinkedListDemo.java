package com.data_structure;

public class LinkedListDemo {
	Node head = null, current = null;
	int pos = 0;

	public void add(int data) {
		Node n = new Node();
		n.data = data;
		if (head == null) {
			head = n;
			current = n;
		} else {
			current.nextNode = n;
			current = n;

		}
		pos++;
	}

	/*
	 * public void removeStack() { Node temp=null; Node n=head; while(n!=null) {
	 * if(n.nextNode==null) { temp.nextNode=null; } temp=n; n=n.nextNode; } }
	 */
//	public void removeQueue() {
//		Node n = head;
//		head = n.nextNode;
//	}

	public void removeData(int data) {
		Node temp = null;
		Node n = head;
		while (n != null) {
			if(data==head.data) {
				head=n.nextNode;
			}
			else if (n.data == data) {
				temp.nextNode = n.nextNode;
				//break;
			}
			temp = n;
			n = n.nextNode;
		}
		if (n == null) {
		current=temp;
	}
	}

	public void removeIndex(int index) {
		int ind = 0;
		Node temp = null, n = head;
		while (n != null) {
			ind++;
			if (ind == index) {
				temp.nextNode = n.nextNode;
				//break;
			}
			temp = n;
			n = n.nextNode;
		}
		if (n == null) {
			current=temp;
		}

	}

	public int findSize() {
		int size = 0;
		Node n = head;
		while (n != null) {
			size++;
			n = n.nextNode;
		}
		return size;
	}

	public int findMax() {
		int max = head.data;
		Node temp = head;
		while (temp != null) {
			if (temp.data > max) {
				max = temp.data;
			}
			temp = temp.nextNode;
		}
		return max;
	}
	public int findMin() {
		int min = head.data;
		Node temp = head;
		while (temp != null) {
			if (temp.data < min) {
				min = temp.data;
			}
			temp = temp.nextNode;
		}
		return min;
	}

	public void display() {
		Node n = head;
		System.out.println("Data in Linked List: ");
		while (n != null) {
			System.out.println(n.data);
			n = n.nextNode;
		}
	}
//	public void displayReverse() {
//		Node n=current;
//		Node temp=null;
//		System.out.println("Data in Reverse Order: ");
//		while(n!=null) {
//			System.out.println(n.data);
//			temp=n.nextNode;
//		}
//		temp.nextNode=temp;
//	}
}
