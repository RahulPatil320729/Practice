package com.practice.practice.rahulpatil;


abstract class Car{
	public void drive() {
		System.out.println("drive");
	}	
	
	public abstract void fly();
	
	public abstract void skite();
}

abstract class wagonR extends Car{
	
	public void fly() {
		System.out.println("fly");
	}
}

class updatedWagonR extends wagonR{

	public void skite() {
		System.out.println("skite");
	}
	
	
}

public class AbstractionEg {
	
	public static void main(String[] args) {
		
		Car obj = new updatedWagonR();
		obj.drive();
		obj.fly();
		obj.skite();
	}

}
