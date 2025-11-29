package com.practice.practice.rahulpatil;

import java.util.Arrays;

public class MaxAndMinElementsInArray {

	public static void main(String[] args) {

		int a[] = { 50, 30, 40, 20, 60 };

		//Find Maximum value
		int max = a[0];  //50
		for (int i = 1; i < a.length; i++) {  //30
			if(a[i]>max) { //30>50
				max=a[i];  //50 until max value is get it will run
			}
		}
		System.out.println("Maximum value is : " +max);
		
		//Find Minimum value
		int min = a[0];  //50
		for (int i = 1; i < a.length; i++) {  //30
			if(a[i]<min) { //30<50
				min=a[i];  //30 until min value is get it will run
			}
		}
		System.out.println("Minimum value is : " +min);
		
		//Logic 1 : Second Largest value 
        Arrays.sort(a);
        System.out.println("Second Largest Number: " + a[a.length - 2]);
        
        //Logic 2 : Second largest value 
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != max && a[i] > secondMax) {
                secondMax = a[i];
            }
        }
        System.out.println("Second Largest value is : " + secondMax);
		
		
	}

}
