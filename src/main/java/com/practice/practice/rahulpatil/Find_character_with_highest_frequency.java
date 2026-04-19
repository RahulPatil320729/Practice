package com.practice.practice.rahulpatil;

//Find the character with the highest frequency in a string.
//Given a string, return the character that appears the maximum number of times.
//Example:
//Input: "programming"
//Output: 'g' (because it appears 2 times, same as 'r' and 'm', but depends on logic)

//Time: O(n)
//Space: O(1) (for array) / O(n) (for map)

public class Find_character_with_highest_frequency {

	public static void main(String[] args) {
		String str = "programming";

		int[] freq = new int[26];

		for (char ch : str.toCharArray()) {
			freq[ch - 'a']++;
		}

		int max = 0;
		char result = ' ';

		for (int i = 0; i < 26; i++) {
			if (freq[i] > max) {
				max = freq[i];
				result = (char) (i + 'a');
			}
		}

		System.out.println(result + " -> " + max);
	}

}



