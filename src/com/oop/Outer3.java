package com.stringexamples.com.oop;

public class Outer3 {
    class Inner1
    {
        void show()
        {
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
         new Outer1().new Inner1().show();



    }
}
