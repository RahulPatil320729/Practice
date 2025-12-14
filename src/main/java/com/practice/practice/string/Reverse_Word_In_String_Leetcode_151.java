package com.practice.practice.string;

//leetcode problem number 151

public class Reverse_Word_In_String_Leetcode_151 {
	
	public static void main(String[] args) {
		System.out.println(reverseWords(" The Sky    is  blue "));
	}
	
	public static String reverseWords(String s) {
		String[] words = s.split(" +");
		StringBuilder sb = new StringBuilder();
		for(int i=words.length-1; i>=0 ; i--) {
			sb.append(words[i]);
			sb.append(" ");
		}
		return sb.toString().trim();
	}

}
