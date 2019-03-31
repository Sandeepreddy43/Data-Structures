package com.data_structure;

import java.util.Arrays;

public class SortingSearchingTest {
	public static void main(String[] args) {
		int[] arr = { 20, 12, 43, 9, 52, 45, 1, 69, 6, 143, 48 };
		int[] a= {12,24,36,1,2,4,56};
		SortingSearchingDemo sd = new SortingSearchingDemo();
		int bsort[] = sd.bubbleSort(arr);
		System.out.println("Bubble Sort: " + Arrays.toString(bsort));
		int isort[] = sd.insertionSort(a);
		System.out.println("Insertion Sort: " + Arrays.toString(isort));
		sd.linearSearch(arr, 143);
		sd.binarySearch(arr, 43);

	}
}