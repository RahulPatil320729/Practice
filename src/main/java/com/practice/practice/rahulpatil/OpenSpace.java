package com.practice.practice.rahulpatil;

public class OpenSpace {
    public static void main(String[] args) {
        String s1 = "apple";
        String s2 = "ale";
        String s3 = "ple";

        // Check for s2
        int i = 0, j = 0;
        while (i < s2.length() && j < s1.length()) {
            if (s2.charAt(i) == s1.charAt(j)) {
                i++;
            }
            j++;
        }
        if (i == s2.length()) {
            System.out.println(s2 + " is a subsequence of " + s1);
        } else {
            System.out.println(s2 + " is NOT a subsequence of " + s1);
        }

        // Check for s3
        i = 0;
        j = 0;
        while (i < s3.length() && j < s1.length()) {
            if (s3.charAt(i) == s1.charAt(j)) {
                i++;
            }
            j++;
        }
        if (i == s3.length()) {
            System.out.println(s3 + " is a subsequence of " + s1);
        } else {
            System.out.println(s3 + " is NOT a subsequence of " + s1);
        }
    }
}
