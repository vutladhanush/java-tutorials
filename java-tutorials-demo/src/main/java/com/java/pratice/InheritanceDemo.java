package com.java.pratice;

class Engine{
    void start(){
        System.out.println("com.java.pratice.Engine started..");
    }
 }

 class Car  extends Engine{
    void start(){
        System.out.println("com.java.pratice.Car started..");
    }
    void drive(){
        System.out.println("Drive the car..");
    }
 }
 public  class InheritanceDemo {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.start();
        c1.drive();
    }
}