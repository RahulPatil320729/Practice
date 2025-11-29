package com.practice.practice.rahulpatil;

public class Count_Number_Of_Digits_In_Number {

	public static void main(String[] args) {

		int num = 123456;
		int count = 0;

		while (num > 0) {
			num=num/10;
			count++;
		}
		System.out.println("Number of Digit is : " +count);

	}

}
