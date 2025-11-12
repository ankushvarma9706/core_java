package com.stringexamples.com.oop;

public class Outer2 {
    class Inner1
    {
        void show()
        {
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        Outer1.Inner1 obj2 = new Outer1().new Inner1();
        obj2.show();


    }
}
