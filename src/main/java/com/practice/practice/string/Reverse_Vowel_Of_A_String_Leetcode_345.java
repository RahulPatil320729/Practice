package com.practice.practice.string;

//Given a string s, reverse only all the vowels in the string and return it.
//The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

//Input: s = "IceCreAm"
//Output: "AceCreIm"
//Explanation:
//The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

//Input: s = "leetcode"
//Output: "leotcede"

public class Reverse_Vowel_Of_A_String_Leetcode_345 {

	public static void main(String[] args) {
		String str = "IceCreAm";
		System.out.println(reverseVowels(str));
	}

	public static String reverseVowels(String s) {
		char ch[] = s.toCharArray();
		int start = 0;
		int end = s.length() - 1;
		while (start < end) {
			if (!isVowel(ch[start])) {
				start++;
			} else if (!isVowel(ch[end])) {
				end--;
			} else {
				char temp = ch[start];
				ch[start] = ch[end];
				ch[end] = temp;
				start++;
				end--;
			}
		}
		return String.valueOf(ch);
	}

	public static boolean isVowel(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			return true;
		} else {
			return false;
		}
	}

}
