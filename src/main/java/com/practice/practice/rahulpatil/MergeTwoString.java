package com.practice.practice.rahulpatil;

//Inout String s1 = "abc";
//Input String s2 = "def";
//Output merged = "abcdef";

public class MergeTwoString {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "def";

		int len1 = s1.length();
		int len2 = s2.length();

		char[] result = new char[len1 + len2];

		for (int i = 0; i < len1; i++) {
			result[i] = s1.charAt(i);
		}
		for (int i = 0; i < len2; i++) {
			result[len1 + i] = s2.charAt(i);
		}

		// Convert char array to String
		String merged = new String(result);
		System.out.println(merged.toString()); // abcdef
	}

//  public static void main(String[] args) {
//  String s1 = "abc";
//  String s2 = "def";
//  StringBuilder sb = new StringBuilder();
//  sb.append(s1);
//  sb.append(s2);
//  String result = sb.toString();
//  System.out.println(result); // abcdef
//}

}
