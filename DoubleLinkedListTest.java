package com.data_structure;

public class DoubleLinkedListTest {
	public static void main(String[] args) {
		DoubleLinkedListDemo d=new DoubleLinkedListDemo();
		d.add(20);
		d.add(30);
		d.add(40);
		d.display();
		d.displayReverseOrder();
		d.removeStack();
		d.removeQueue();
		d.add(50);
		d.add(60);
		d.removeQueue();
//		d.removeStack();
		d.display();
		d.displayReverseOrder();
	}
}
