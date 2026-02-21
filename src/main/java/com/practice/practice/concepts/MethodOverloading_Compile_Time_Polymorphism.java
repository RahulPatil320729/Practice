package com.practice.practice.concepts;

class Calculator {

    // Method 1
    int add(int a, int b) {
        return a + b;
    }

    // Method 2 (different number of parameters)
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3 (different type of parameters)
    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloading_Compile_Time_Polymorphism {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        System.out.println(cal.add(10, 20));        // 30
        System.out.println(cal.add(10, 20, 30));    // 60
        System.out.println(cal.add(5.5, 4.5));      // 10.0
    }
}



//👉 What is Method Overloading?
//Method Overloading means:
//Same method name, but different parameters (number, type, or order) in the same class.
//It happens in the same class.
//🔥 Rules:
//✔ Method name must be same
//✔ Parameters must be different
//❌ Return type alone cannot differentiate methods