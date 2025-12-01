package com.practice.practice.string;

public class StringPalindrome {

	public static void main(String[] args) {

		String str = "Rahul";
		
//		String rstr = "";
//		for (int i = str.length() - 1; i >= 0; i--) {
//			rstr = rstr + str.charAt(i);
//		}
//		if (rstr.equals(str)) {
//			System.out.println("String is Palindrome");
//		} else {
//			System.err.println("String is not Palindrome");
//		}
		
//		String rstr="";
//		for(int i=0 ; i <str.length() ; i++) {
//			rstr = rstr + str.charAt(i);
//		}
//		System.out.println(rstr);
		
		StringBuilder sb = new StringBuilder(str);
		String rstr = sb.reverse().toString();
		if(str.equals(rstr)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}
	

	}

}
