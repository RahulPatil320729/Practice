package com.practice.practice.string;

///leetcode 28

public class Index_of_First_Occurrence_In_a_String {
    
    public static void main(String[] args) {
        System.out.println(strStr("leetcode", "leet")); 
    }
    
    //First approach
    public static int strStr(String haystack, String needle) {
    	for(int i=0; i<haystack.length()-needle.length()+1;i++) {
    		if(haystack.charAt(i)==needle.charAt(0)) {
    			if(haystack.substring(i,needle.length()+i).equals(needle)) {
    				return i;
    			}
    		}
    	}
		return -1;
    }
    
    //Second approach
//    public static int strStr(String haystack, String needle) {
//        int n = haystack.length();
//        int m = needle.length();
//
//        for (int i = 0; i <= n - m; i++) {
//            int j = 0;
//            for (j = 0; j < m; j++) {
//                if (haystack.charAt(i + j) != needle.charAt(j)) {
//                    break;
//                }
//            }
//            if (j == m) {
//                return i;
//            }
//        }
//        return -1; 
//    }
    
    
}
