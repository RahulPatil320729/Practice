package com.practice.practice.string;

public class SubstringCheckUsingLoops {

    public static void main(String[] args) {
        String parent = "abcdefghij";
        String sub1 = "cde";
        String sub2 = "xyz";

        boolean present1 = findSubstring(parent, sub1);
        boolean present2 = findSubstring(parent, sub2);

        // Final combined decision
        if (present1 && present2) {
            System.out.println("Both substrings are present");
        } else if (!present1 && !present2) {
            System.out.println("Both substrings are NOT present");
        } else if (present1 && !present2) {
            System.out.println(sub1 + " is present, but " + sub2 + " is NOT present");
        } else {
            System.out.println(sub2 + " is present, but " + sub1 + " is NOT present");
        }
    }

    // Manual substring check using for-loops
    public static boolean findSubstring(String parent, String sub) {
        int n = parent.length();
        int m = sub.length();

        for (int i = 0; i <= n - m; i++) {
            int j;

            for (j = 0; j < m; j++) {
                if (parent.charAt(i + j) != sub.charAt(j)) {
                    break;
                }
            }

            if (j == m) {  // Full match
                return true;
            }
        }
        return false;
    }
}

