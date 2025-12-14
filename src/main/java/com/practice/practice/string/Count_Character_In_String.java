package com.practice.practice.string;

//String s="Hello Java"
//Count=9

class Count_Character_In_String {
	
	public static void main(String[] args) {
		String s="Hello Java";
		int count=0;
		for(int i=0; i <=s.length()-1; i++) {
			if(s.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println("Number of character in String is : " +count);
	}

}
