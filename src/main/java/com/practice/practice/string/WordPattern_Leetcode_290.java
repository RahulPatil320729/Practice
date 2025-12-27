package com.practice.practice.string;

import java.util.HashMap;

//Input : pattern = "abba" , s= "dog cat cat dog"
//Output : true

//Input : pattern = "abba" , s= "dog cat cat fish"
//Output : false

public class WordPattern_Leetcode_290 {

	public static void main(String[] args) {
		String pattern="abba";
		String s = "dog, cat, cat, fish";
		System.out.println(wordPattern(pattern, s));
	}
	
	public static boolean wordPattern(String pattern, String s) {
	    String[] words = s.split(", ");
	    if (pattern.length() != words.length) {
	        return false;
	    }

	    HashMap<Object, Integer> map = new HashMap<>();

	    for (int i = 0; i < pattern.length(); i++) {
	    	//Get current char & word
	        char ch = pattern.charAt(i);
	        String word = words[i];
	        //Store index for character
	        if (!map.containsKey(ch)) {
	            map.put(ch, i);
	        }
	        //Store index for word
	        if (!map.containsKey(word)) {
	            map.put(word, i);
	        }
	        //Store index for word
	        if (!map.get(ch).equals(map.get(word))) {
	            return false;
	        }
	    }
	    return true;
	}

	
}
