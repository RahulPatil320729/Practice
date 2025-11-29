package com.practice.practice.rahulpatil;

public class Count_Character_Occurance {
	
	public static void main(String[] args) {
		
		String s = "Java Programming Java oops";  
		
	    int  totalcount = s.length(); 
		int totalcount_afterRemove_a = s.replace("a", "").length();  // total length after removing a
		int count = totalcount - totalcount_afterRemove_a;		
		System.out.println("Number of occurance of a is : " +count);
		
	}

}
