package com.practice.practice.concepts;

class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverriding_Run_Time_Polymorphism {
    public static void main(String[] args) {

        Animal obj = new Dog();  // Parent reference, child object
        obj.sound();             // Dog barks
    }
}




//👉 What is Method Overriding?
//Method Overriding means:
//A child class provides a new implementation of a method that already exists in the parent class.
//It happens in different classes (Inheritance required).
//🔥 Rules:
//✔ Method name must be same
//✔ Parameters must be same
//✔ Must have inheritance
//✔ Access modifier cannot be more restrictive
//✔ Return type must be same or covariant


//🔎 Why it is called Run-Time Polymorphism?
//Because JVM decides which method to call at runtime based on object.