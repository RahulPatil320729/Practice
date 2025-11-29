package com.practice.practice.rahulpatil;

import java.util.Arrays;

public class Sort_Element_Using_Bubble_Sort {

	public static void main(String[] args) {

		int a[] = { 4, 2, 1, 5, 3 };
		System.out.println("Array before sorting..." + Arrays.toString(a));

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
//		System.out.print("Array after sorting...");
//		for (int i = 0; i < a.length; i++) {	
//			System.out.print(a[i] +" ");
//		}
		System.out.println("Array after sorting..." +Arrays.toString(a));
	}

}
