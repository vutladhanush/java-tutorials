package com.java.pratice;

public class ThisKeywordDemo {
    int length, width;

    // Constructor  Default
    ThisKeywordDemo() {
        this(34, 56); // Calls Constructor 2
    }

    // Constructor Parameterized
    ThisKeywordDemo(int length, int width) {
        this.length = length;
        this.width = width;

    }
    void  displayArea(){
        System.out.println("Area : "+length*width);
    }
    void display() {
        System.out.println(length + " " + width);
        this.displayArea();
    }


    public static void main(String[] args) {
        ThisKeywordDemo demo = new ThisKeywordDemo();
        demo.display();
    }
}

