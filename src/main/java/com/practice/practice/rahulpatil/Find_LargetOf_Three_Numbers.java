package com.practice.practice.rahulpatil;

import java.util.Scanner;

public class Find_LargetOf_Three_Numbers {

	public static void main(String[] args) {

		// a=10 b=20 c=30
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number :");
		int a = sc.nextInt();
		System.out.println("Enter the first number :");
		int b = sc.nextInt();
		System.out.println("Enter the first number :");
		int c = sc.nextInt();
		
		//Approach first
		if(a>b && a>c) {
			System.out.println("a is largest number " +a);
		}else if(b>a && b>c){
			System.out.println("b is largest number " +b);
		}else {
			System.out.println("c is largest number " +c);
		}
		
		//Ternary operator 
//		int largest1=a>b?a:b;
//		int largest2=c>largest1?c:largest1;
//		System.out.println(largest2+ " is a largest number");
		
	}

}
