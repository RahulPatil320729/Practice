package com.practice.practice.rahulpatil;

public class Remove_WhiteSpaces_InString {
	
	public static void main(String[] args) {
		
		String str = "Rahul   Padmakar Patil is Java     Full Stack Developer ";
		
	    String output = str.replaceAll("\\s", "");
	    System.out.println("After removing the whitespaces : " +output);
	}

}
