package com.practice.practice.string;

import java.util.Arrays;

//Given two strings s and t, return true if t is an anagram of s, and false otherwise.

//Example 1:
//Input: s = "anagram", t = "nagaram"
//Output: true

//Example 2:
//Input: s = "rat", t = "car"
//Output: false

public class Anagram_Leetcode_242 {

	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
		if (isAnagram(s, t)) {
			System.out.println(s + " and " + t + " are anagrams");
		} else {
			System.out.println(s + " and " + t + " are not anagrams");
		}
	}

	public static boolean isAnagram(String s, String t) {

		int m = s.length();
		int n = t.length();

		if (m != n) {
			return false;
		} else {
			int count[] = new int[26];
			for (int i = 0; i < m; i++) {
				count[s.charAt(i) - 'a']++;
			}
			for (int i = 0; i < n; i++) {
				count[t.charAt(i) - 'a']--;
			}
			
			for(int i=0;i<count.length;i++) {
				if(count[i]!=0) {
					return false;
				}
			}
			return true;
			
		}
	}

}
