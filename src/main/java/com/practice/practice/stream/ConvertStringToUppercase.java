package com.practice.practice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertStringToUppercase {
;
	public static void main(String[] args) {
		
//		String str= "rahul";
//		System.out.println(str.toUpperCase());
		
		List<String> words = Arrays.asList("Java", "Spring", "Rahul", "Sql");
		List<String> toupper = words.stream().map(String :: toUpperCase).collect(Collectors.toList());
		System.out.println(toupper);
		
		
	}
	
}
