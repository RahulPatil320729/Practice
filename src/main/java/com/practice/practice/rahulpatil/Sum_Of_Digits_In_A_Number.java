package com.practice.practice.rahulpatil;

public class Sum_Of_Digits_In_A_Number {

	public static void main(String[] args) {

		// Number=1234
		// Sum=10
		
		// Number=-78
		// Sum=15

		int number = 1234;
		int sum = 0;

		number = Math.abs(number);  // Ignore minus sign
		
		while (number > 0) {
			sum = sum + number % 10;
			number = number / 10;
		}
		System.out.println(sum);

	}

}
