package com.practice.practice.concepts;

class VariableExample {

    //  Instance Variable (belongs to object)
    String name;
    int age;

    //  Static Variable (belongs to class)
    static String company = "Tech Solutions";

    //  Method to show variables
    void displayDetails() {

        //  Local Variable (inside method)
        String project = "Banking App";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Company: " + company);
        System.out.println("Project: " + project);
        System.out.println("------------------------");
    }

    public static void main(String[] args) {

        // Object 1
        VariableExample emp1 = new VariableExample();
        emp1.name = "Rahul";
        emp1.age = 25;

        // Object 2
        VariableExample emp2 = new VariableExample();
        emp2.name = "Amit";
        emp2.age = 28;

        emp1.displayDetails();
        emp2.displayDetails();
    }
}
