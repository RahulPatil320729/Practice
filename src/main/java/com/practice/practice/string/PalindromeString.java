package com.practice.practice.string;

//Palindrome

public class PalindromeString {

	public static void main(String[] args) {

		String str = "radar";
		String rstr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rstr = rstr + str.charAt(i);
		}
		if(str.toLowerCase().equals(rstr.toLowerCase())) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}
	}

}
