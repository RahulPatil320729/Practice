package com.practice.practice.rahulpatil;

public class RemoveJunk {

	public static void main(String[] args) {

		String a = "He@ll#o W!o$r%l^d123";

		String s = a.replaceAll("[^a-zA-Z0-9]", ""); // op : HelloWorld123
		System.out.println(s);

		String s1 = a.replaceAll("[a-zA-Z0-9]", ""); // op : @# !$%^
		System.out.println(s1);
	}

}
