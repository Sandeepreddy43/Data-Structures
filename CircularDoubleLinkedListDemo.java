package com.data_structure;

public class CircularDoubleLinkedListDemo {
	NodeDouble head,current=null;
	public void add(int data) {
		NodeDouble d=new NodeDouble();
		d.data=data;
		if(head==null) {
			head=d;
			current=d;
		}
		else {
			current.nextNode=d;
			d.previosNode=current;
			current=d;
			head.previosNode=d;
			d.nextNode=head;
		}
		//System.out.println("***"+d.data);
	}
	public NodeDouble display() {
		NodeDouble n=head;
		while(head!=n.nextNode) {
		System.out.println("***"+n.data);
		n=n.nextNode;
		}
		return display();
	}
}