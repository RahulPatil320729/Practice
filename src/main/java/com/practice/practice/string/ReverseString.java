package com.practice.practice.string;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String str="INTERVIEW";
		
		//approach 1
		String rstr="";
		for(int i= str.length()-1; i>=0 ; i--) {
			rstr= rstr+str.charAt(i);
		}
		System.out.println("Reverse String approch 1 : " +rstr);
		
		//approach 2
		StringBuilder sb= new StringBuilder(str);
		System.out.println("Reverse String approch 2 : " +sb.reverse().toString());
		
		//approach 3
		StringBuffer sb1= new StringBuffer(str);
		System.out.println("Reverse String approch 3 : " +sb1.reverse().toString());
		
		
	}

}
