package com.practice.practice.rahulpatil;

import java.util.HashSet;

public class DuplicateElementsInArray {

	public static void main(String[] args) {

		String arr[] = { "Java", "C", "C++", "Python", "Java" };

		// Approach 1
//		boolean flag=false;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i+1; j < arr.length; j++) {
//				if(arr[i]==arr[j]) {
//					System.out.println("Found Duplicate Elements : " +arr[i]);
//					flag=true;
//				}
//			}
//		}
//		if(flag==false) {
//			System.out.println("Duplicate Element is not found");
//		}

		// Approach 2 Using Hashset
		boolean flag=false;
		HashSet<String> hs = new HashSet();
		for (String l : arr) {
			if(hs.add(l)==false) {  // if value is duplicate it will return false and not duplicate then it will get true
				System.out.println("Founf Duplcate Element : " +l);  
				flag=true;
			}
		}
		if(flag=false) {
			System.out.println("Not found duplicate");
		}
		
	}

}
