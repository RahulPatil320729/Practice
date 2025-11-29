package com.practice.practice.rahulpatil;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");

		int num = sc.nextInt();
		int original_number = num;

		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (original_number == rev) {
			System.out.println("Number is Palindrom");
		} else {
			System.out.println("Number is not Palindrome");
		}

	}

}
