package com.java.pratice;

class Animals {

    final void sound() {
        System.out.println("Animal makes sound");
    }
}

class Cat extends Animals {

    // Compilation error if uncommented
//     void sound() {
//        System.out.println("Dog barks");
//     }
}

public class FinalKeywordDemo {

    public static void main(String[] args) {
         int age = 20;
        Cat d = new Cat();
        d.sound();
    }
}