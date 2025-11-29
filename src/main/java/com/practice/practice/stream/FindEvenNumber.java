package com.practice.practice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNumber {

	public static void main(String[] args) {

		//List approach
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("Even Number in list : " + evenNumbers);

		//Array approach
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] evenNumbers2 = Arrays.stream(a).filter(num -> num % 2 == 0).toArray();
		System.out.println("Even Number in array : " +Arrays.toString(evenNumbers2));

	}

}
