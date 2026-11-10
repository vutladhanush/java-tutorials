package com.java.pratice;

public class StaticDemo {

    // 1. Static variable
    static String college = "KL University";

    // Instance variable
    String name;

    // 2. Static block
    static {
        System.out.println("Static block executed");
        college = "KL University";
    }

    // Constructor
    StaticDemo(String name) {
        this.name = name;
    }

    // 3. Static method
    static void displayCollege() {
        System.out.println("College: " + college);
    }

    // Instance method
    void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
    }

    public static void main(String[] args) {

        // Calling static method using class name
        StaticDemo.displayCollege();

        // Creating objects
        StaticDemo s1 = new StaticDemo("Ram");
        StaticDemo s2 = new StaticDemo("Karthik");

        // Calling instance methods
        s1.displayStudent();
        s2.displayStudent();
    }
}