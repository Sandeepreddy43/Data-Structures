package com.data_structure;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedListDemo l = new LinkedListDemo();
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(40);
		l.add(50);
		l.display();
		int size=l.findSize();
		System.out.println("Size of Linked List: "+size);
		int max=l.findMax();
		System.out.println("Max Element in L List: "+max);
		int min=l.findMin();
		System.out.println("Min Element in L List: "+min);
		l.removeData(20);
		l.display();
		l.removeIndex(2);
		l.display();
		l.add(80);		
		l.display();
		l.add(100);
		l.display();
		l.removeData(80);
		l.add(43);
		l.add(9);
		l.display();
		int max1=l.findMax();
		System.out.println("Max Element in L List: "+max1);
		int sizef=l.findSize();
		int min1=l.findMin();
		System.out.println("Min Element in L List: "+min1);
		System.out.println("Size of Linked List: "+sizef);
	}

}
