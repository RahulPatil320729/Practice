package com.practice.practice.rahulpatil;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Rahul Patil";

		// Approach 1
//		String rstr="";
//		for(int i=str.length()-1 ; i>=0; i--) {
//			rstr = rstr + str.charAt(i);
//		}
//		System.out.println(rstr);

		// Approach 2
//		StringBuilder sb = new StringBuilder(str);
//        String reversed = sb.reverse().toString();
//        System.out.println(reversed);

		// Aprroach 3
		StringBuffer sb = new StringBuffer(str);
		String reversed = sb.reverse().toString();
		System.out.println(reversed);

	}

}
