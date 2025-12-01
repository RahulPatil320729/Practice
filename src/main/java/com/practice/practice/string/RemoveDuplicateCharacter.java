package com.practice.practice.string;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacter {
	
	public static void main(String[] args) {
		
		 String str = "ababbcddee";
		 
		 //Using LinkedHashSet
	     StringBuilder result = new StringBuilder();
	     Set<Character> set = new LinkedHashSet<>();
	     for (char i : str.toCharArray()) {
	         set.add(i); 
	     }
	     for (char i : set) {
	         result.append(i);
	     }
	     System.out.println("Original: " + str);
	     System.out.println("After removing duplicates: " + result.toString());
	     
	     
	     //Normal Way
//		 String result = "";
//		 for (int i = 0; i < str.length(); i++) {
//		     char ch = str.charAt(i);
//		     if (result.indexOf(ch) == -1) {
//		         result += ch;
//		     }
//		 }
//		 System.out.println(result);
		 
		 
		 //Using Stream api
//		 String result = str.chars()
//			        .distinct()
//			        .collect(
//			            StringBuilder::new,
//			            StringBuilder::appendCodePoint,
//			            StringBuilder::append
//			        )
//			        .toString();
//		 System.out.println(result);

	     
	 }
		
}
