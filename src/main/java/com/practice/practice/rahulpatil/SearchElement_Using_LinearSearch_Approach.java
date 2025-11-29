package com.practice.practice.rahulpatil;

public class SearchElement_Using_LinearSearch_Approach {

	public static void main(String[] args) {

		int a[] = { 10, 20, 40, 50, 30 };

		int search_element = 50;

		for (int i = 0; i < a.length; i++) {
			if(search_element==a[i]) {
				System.out.println("Element is found at: " +a[i]);
			}
		}
		System.out.println("Element is not found");
	}

}
