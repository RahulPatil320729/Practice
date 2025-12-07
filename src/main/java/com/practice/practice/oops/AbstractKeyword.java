package com.practice.practice.oops;

//1.
abstract class Car{
	
	public abstract void drive();
	public abstract void fly();
	
    public void playMusic() {
    	System.out.println("play music");
    }   
}

//2
abstract class WagonR extends Car{
	
	public void drive() {
		System.out.println("drive car");
	}
}

class UpdatedWagonR extends WagonR{   // concrete class
	
	public void fly() {
		System.out.println("fly");
	}
	
}

public class AbstractKeyword {
	
	public static void main(String[] args) {
		
		Car obj = new UpdatedWagonR();  //3
		obj.drive();
		obj.playMusic();
		obj.fly();
		
	}

}


//1.
//If we declare abstract method inside the class then we have to make class as abstract also other wise will get error like that (The abstract method drive in type Car can only be defined by an abstract class).
//abstract class can have abstract and non abstract method.

//2.
//If you want dont want to declare all abstract method inside the abstract class then you have to make child class also abstract 

//3. 
//you cannot create instance(object) of abstract class so that why as you can see object is created of non abstract class (UpdatedWagonR).
