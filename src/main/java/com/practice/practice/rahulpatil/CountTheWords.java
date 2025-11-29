package com.practice.practice.rahulpatil;

import java.util.Scanner;

public class CountTheWords {

	public static void main(String[] args) {
		
	      System.out.println("Enter the String: ");
	        Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine().trim();   
	        
	        int count = (s.isEmpty()) ? 0 : s.split("\\s+").length;
	        System.out.println("Number of words: " + count);
	    }

}
