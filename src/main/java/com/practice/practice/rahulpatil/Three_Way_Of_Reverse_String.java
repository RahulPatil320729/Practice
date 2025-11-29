package com.practice.practice.rahulpatil;

public class Three_Way_Of_Reverse_String {

	public static void main(String[] args) {

		String str = "ABCD";
		String rev = "";

		// Logic 1 : Using + (String Concatenation) operator
//		int len = str.length(); // 4
//		for (int i = len - 1; i >= 0; i--) {
//			rev = rev + str.charAt(i);
//		}
//		System.out.println("Reverse the String:" +rev)

		// Logic 2 : Using Character Array
//		char a[] = str.toCharArray();
//		int len = a.length;
//		for (int i = len - 1; i >= 0; i--) {
//			rev=rev+a[i];
//		}
//		System.out.println("Reverse the String:" +rev);

		// Logic 3 : Using StringBuffer Class
//		StringBuffer sb = new StringBuffer(str);
//		System.out.println("Rverese the String: " +sb.reverse());

		// Logic 4 : My logic
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			rev = ch +rev;
		}
		System.out.println("Reverse the String : " +rev);

	}

}
