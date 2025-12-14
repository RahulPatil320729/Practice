package com.practice.practice.rahulpatil;

import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");

		String str = sc.next();
		String original_str = str;

		String rev = "";
		int len = str.length();
		
		for(int i = len-1 ; i >=0 ; i--) {
			rev = rev+str.charAt(i);
		}

		if (original_str.toLowerCase().equals(rev.toLowerCase())) {
			System.out.println("String is Palindrome");
		}else {
			System.out.println("String is not Plaindrome");
		}

	}

}
