package com.practice.practice.oops;

//All the methods in the interface are internally public abstract void
//All the variables in the interface are internally public static final that is constant

interface Paymentt {
    void pay(double amount);  // abstract method
}

class UpiPayment implements Paymentt {

    @Override
    public void pay(double amount) {
        System.out.println("Processing UPI payment of " + amount);
    }
}

class CreditCardPayment implements Paymentt {

    @Override
    public void pay(double amount) {
        System.out.println("Processing Credit Card payment of " + amount);
    }
}

public class Abstraction_Using_Interface {
    public static void main(String[] args) {

    	Paymentt payment = new UpiPayment();
        payment.pay(5000);

        payment = new CreditCardPayment();
        payment.pay(10000);
    }
}