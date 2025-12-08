package com.practice.practice.oops;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online

//Step 1: Create an interface (only rules)
interface Payment {
 void pay();         // must be implemented
 void validate();    // must be implemented
}

//Step 2: Create an abstract class implementing interface
abstract class BasePayment implements Payment {

 // Common logic for all payment types (already implemented)
 @Override
 public void validate() {
     System.out.println("Validation done Successfully!");
 }

 // pay() is NOT implemented here → child class must implement
 // public void pay();
}

//Step 3: Create normal class that extends abstract class
class GooglePay extends BasePayment {

 @Override
 public void pay() {
     System.out.println("Payment done using Google Pay!");
 }
}

//Step 4: Main method to test everything
class InterfaceKeyword{
 public static void main(String[] args) {
     GooglePay gpay = new GooglePay();
     gpay.validate();   // coming from abstract class
     gpay.pay();        // coming from child class
 }
}
