package com.data_structure;

public class SortingSearchingDemo {
	public int[] bubbleSort(int[] ar) {
		int temp;
		for (int s = 0; s < ar.length; s++) {
			for (int i = 0, j = i + 1; i < ar.length - 1; i++, j++) {
				{
					if (ar[i] > ar[j]) {
						temp = ar[j];
						ar[j] = ar[i];
						ar[i] = temp;
					}
				}
			}
		}
		return ar;
	}

	public int[] insertionSort(int[] ar) {
		int temp, swap;
		for (int s = 0; s < ar.length; s++) {
			for (int i = 0; i < ar.length; i++) {
				for (int j = 0; j < ar.length - 1; j++) {
					temp = ar[i];
					if (temp < ar[j]) {
						swap = temp;
						temp=ar[j];
						ar[j] = swap;
						ar[i]=temp;
					}
				}
			}
		}

		return ar;
	}

	public void linearSearch(int[] ar, int data) {
		int index = -1;
		for (int i = 0; i < ar.length; i++) {
			index++;
			if (data == ar[i]) {
				System.out.println("Index Position: " + index);
				break;
			} else {
				if (index == ar.length - 1) {
					System.out.println("Data Not Found ");
					break;
				}
				continue;
			}
		}
	}

	public void binarySearch(int[] ar, int data) {
		if (data >= ar[ar.length / 2]) {
			int index = (ar.length / 2) - 1;
			for (int i = (ar.length / 2); i < ar.length; i++) {
				index++;
				if (data == ar[i]) {
					System.out.println("Index Position: " + index);
					break;
				} else {
					if (index == ar.length - 1) {
						System.out.println("Data Not Found ");
						break;
					}
					continue;
				}
			}
		} else if (data < ar[ar.length / 2]) {
			int index = -1;
			for (int i = 0; i < ar.length / 2; i++) {
				index++;
				if (data == ar[i]) {
					System.out.println("Index Position: " + index);
					break;
				} else {
					if (index == ar.length / 2) {
						System.out.println("Data Not Found ");
						break;
					}
					continue;
				}
			}
		}
	}
}