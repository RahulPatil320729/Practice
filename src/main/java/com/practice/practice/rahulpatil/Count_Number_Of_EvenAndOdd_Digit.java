package com.practice.practice.rahulpatil;

public class Count_Number_Of_EvenAndOdd_Digit {

	public static void main(String[] args) {

		// Number = 145678
		// Even=3 and Odd=3
		int num = 145678;
		int even_count = 0;
		int odd_count = 0;

		while (num > 0) { // 145678
			int rem = num % 10; // 8

			if (rem % 2 == 0) {
				even_count++; // 1
			} else {
				odd_count++;
			}
			num = num / 10; // 14567
		}
		System.out.println("Even number count : " + even_count + " Odd number count : " + odd_count);

	}

}
