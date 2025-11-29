package com.practice.practice.rahulpatil;

public class Five_Way_Swapping_Number {

	public static void main(String[] args) {
		int a = 10, b= 20;
		System.out.println("Before swapping the values " +a+ " " +b);
		
		//Login 1 : with Third Variable
//		int t = a;
//		a=b;
//		b=t;
		
		//Logic 2 : without third variable 
//		a = a+b;
//		b = a-b;
//		a = a-b;
		
		//Logic 3 : use * and / without using the third variable
//		a=a*b/10;
//		b=a*b/40;
		
		//Logic 4 : use bitwise XOR (^) opertor without using third varible 10 = 1010 / 20 = 10100
//		a = a ^ b;  
//		b = a ^ b;
//		a = a ^ b;
		
		//Logic 5 : Single statement
		b=a+b-(a=b);   //a=b=20 / a+b=30 / b=30-20=10
		
		
		System.out.println("After the swapping the values " +a+ " " +b);
	}

}
