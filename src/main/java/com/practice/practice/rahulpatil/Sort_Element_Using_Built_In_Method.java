package com.practice.practice.rahulpatil;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Sort_Element_Using_Built_In_Method {

	public static void main(String[] args) {

		// Approach 1 - Parallel sort method
//		int a[] = { 30, 50, 20, 10, 60 };
//		System.out.println("Array elements before sorting :" +Arrays.toString(a));
//		Arrays.parallelSort(a);
//		System.out.println("Array elements after sorting : " +Arrays.toString(a));
		
		//Approach 2 - sort 
//		int a[] = { 30, 50, 20, 10, 60 };
//		System.out.println("Array elements before sorting :" +Arrays.toString(a));
//		Arrays.sort(a);
//		System.out.println("Array elements after sorting : " +Arrays.toString(a));
		
		//Approach 3 - Reverse descending order
		Integer a[] = { 30, 50, 20, 10, 60 };
		System.out.println("Array elements before sorting :" +Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("Array elements after sorting : " +Arrays.toString(a));
	}

}
