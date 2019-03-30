package com.data_structure;

public class CircularLinkedListDemo {
	Node head,current=null;
	public void add(int data) {
		Node n=new Node();
		n.data=data;
		if(head==null) {
			head=n;
			current=n;
		}
		else {
			current.nextNode=n;
			current=n;
			n.nextNode=head;
		}
	}
	public void removeQueue() {
		Node n=head;
		head=n.nextNode;
	}
	public void display() {
		Node n=head;
		while(head!=n.nextNode) {
			System.out.println("***"+n.data);
			n=n.nextNode;
		}
	}
}
