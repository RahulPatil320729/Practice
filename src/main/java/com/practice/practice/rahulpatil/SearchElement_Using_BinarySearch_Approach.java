package com.practice.practice.rahulpatil;

public class SearchElement_Using_BinarySearch_Approach {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int key = 5;
		int l = 0, h = a.length - 1;
		boolean flag = false;

		while (l <= h) {
			int m = (l + h) / 2;
			if (a[m] == key) {
				System.out.println("Element is found ...");
				flag = true;
				break;
			}
			if (a[m] < key) {
				l = m + 1;
			}
			if (a[m] > key) {
				h = m - 1;
			}
		}
		if (!flag) {
            System.out.println("Element is not found ...");
        }
	}

}
