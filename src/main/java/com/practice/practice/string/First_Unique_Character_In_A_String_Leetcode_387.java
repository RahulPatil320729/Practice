package com.practice.practice.string;

//Given a String s, find the first non repeating character in it and return its index. If it does not exist return -1

//Example 1:
//Input :  s = "leetcode"
//Output : 0

//Example 2:
//Input : s = "loveleetcode"
//Output : 2

//Example 3:
//Input : s = "aabb"
//Output : -1

public class First_Unique_Character_In_A_String_Leetcode_387 {

	public static void main(String[] args) {
		String str = "loveleetcode";
		System.out.println(firstUnique(str)); // Output: 2
	}

	// Approach 1
	public static int firstUnique(String s) {
    	int[] freq = new int[26];
    	char[] chars = s.toCharArray();
    	for(char c :chars) {
    		freq[c-'a']++;
    	}
    	for(int i=0;i<chars.length;i++) {
    		if(freq[chars[i]-'a']==1) {
    			return i;
    		}
    	}
		return -1;
    }

	// Approach 2
//    public static int firstUnique(String s) {
//        for (int i = 0; i < s.length(); i++) {
//            boolean isUnique = true;
//
//            for (int j = 0; j < s.length(); j++) {
//                if (i != j && s.charAt(i) == s.charAt(j)) {
//                    isUnique = false;
//                    break;
//                }
//            }
//
//            if (isUnique) {
//                return i; // first non-repeating character index
//            }
//        }
//        return -1; // no unique character
//    }

}
