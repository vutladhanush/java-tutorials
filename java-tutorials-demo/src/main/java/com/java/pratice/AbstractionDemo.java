package com.java.pratice;

abstract class Animal{
    abstract void bark();
    void walk()
    {
        System.out.println("Animal is walking...");
    }
}
 class Dog extends Animal
 {
     void bark()
     {
         System.out.println("Dog is barking ...");
     }
 }
 public class AbstractionDemo{
    public static void main(String []args)
    {
        Animal d = new Dog();
        d.walk();
        d.bark();
    }
 }