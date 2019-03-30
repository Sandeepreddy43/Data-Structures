package com.data_structure;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySizeDemo {
	Scanner s = new Scanner(System.in);
	String arradd[], arrdel[];
	int d=1;

	public String[] addElement(String[] ar, int add) {
		arradd = new String[ar.length + add];
		for (int i = 0; i < ar.length; i++) {
			arradd[i] = ar[i];
		}
		System.out.println("After Coping :: " + Arrays.toString(arradd));
		for (int i = ar.length; i < arradd.length; i++) {
			System.out.println("Enter " + i + " Element: ");
			arradd[i] = s.next();
		}
		System.out.println("After adding " + add + " Elements: " + Arrays.toString(arradd));
		return arradd;
	}

	public String[] delElement(String[] ar, int count) {
		int index;
		if (count == 0)
			return arrdel;
		else {
		arrdel = new String[ar.length - 1];
		System.out.println("********************"+Arrays.toString(arrdel));
		System.out.println("Enter " + d + " element index, u want to delete: ");
		index = s.nextInt();
		for (int j = 0, k = 0; j < ar.length; j++) {
			if (j == index) {
				continue;
			}
			arrdel[k++] = ar[j];
		}
		System.out.println("After Deleting" + Arrays.toString(arrdel));

		--count;
		return delElement(arrdel, count);
		}
	}
}
