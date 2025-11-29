package com.practice.practice.rahulpatil;

import java.util.Scanner;

public class Three_Way_Of_Reverse_Number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();

		// 1. Using algorithm
//		int rev = 0;
//		while (num != 0) {
//			rev = rev * 10 + num % 10; // 0*10 + 1234%10 = 4
//			num = num / 10;  // 1234/10 = 123
//		}
		
		//2. Using StringBuffer class 
//		StringBuffer sb = new StringBuffer(String.valueOf(num));
//		StringBuffer rev = sb.reverse();
		
		//3. Using StringBuilder class
		StringBuilder sb = new StringBuilder(String.valueOf(num));
		StringBuilder rev = sb.reverse();
		
		System.out.println("Reverse the number: " + rev);

	}

}
