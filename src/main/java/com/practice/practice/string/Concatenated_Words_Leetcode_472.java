package com.practice.practice.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

//Given an array of strings words (without duplicates), return all the concatenated words in the given list of words.
//A concatenated word is defined as a string that is comprised entirely of at least two shorter words (not necessarily distinct) in the given array.

//Example 1:
//Input: words = ["cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"]
//Output: ["catsdogcats","dogcatsdog","ratcatdogcat"]
//Explanation: "catsdogcats" can be concatenated by "cats", "dog" and "cats"; 
//"dogcatsdog" can be concatenated by "dog", "cats" and "dog"; 
//"ratcatdogcat" can be concatenated by "rat", "cat", "dog" and "cat".

//Example 2:
//Input: words = ["cat","dog","catdog"]
//Output: ["catdog"]

public class Concatenated_Words_Leetcode_472 {

	public static void main(String[] args) {
		String[] words = { "cat", "cats", "catsdogcats", "dog", "dogcatsdog", "hippopotamuses", "rat", "ratcatdogcat" };
		System.out.println(findAllConcatenatedWordsInADict(words));
	}

	public static List<String> findAllConcatenatedWordsInADict(String[] words) {
		HashMap<String, Boolean> hm = new HashMap<String, Boolean>();
		Set<String> hs = new HashSet<String>();
		for (String word : words) {
			hs.add(word);
		}
		List<String> result = new ArrayList<String>();
		for (int i = 0; i < words.length; i++) {
			if (IsConcatenate(words[i], hs, hm)) {
				result.add(words[i]);
			}
		}
		return result;
	}

	public static boolean IsConcatenate(String word, Set<String> st, Map<String, Boolean> hm) {
		if (hm.containsKey(word)) {
			return hm.get(word);
		}

		for (int i = 0; i < word.length(); i++) {
			String prefix = word.substring(0, i + 1);
			String suffix = word.substring(i + 1, word.length());
			if (st.contains(prefix) && st.contains(suffix) || st.contains(prefix) && IsConcatenate(suffix, st, hm)) {
				hm.put(word, true);
				return true;
			}
		}
		hm.put(word, false);
		return false;
	}

}
