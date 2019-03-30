package com.data_structure;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySizeDemoTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String arr[] = { "One", "Two", "Three", "Four", "Five", "Six" };
		System.out.println("Given Array: " + Arrays.toString(arr));
		System.out.println("How many Elements u want to add..? ");
		int add = sc.nextInt();
		ArraySizeDemo asd = new ArraySizeDemo();
		asd.addElement(arr, add);
		System.out.println("Enter how many Elements u want to delete..?");
		int del = sc.nextInt();
		asd.delElement(arr, del);
		sc.close();
	}
}