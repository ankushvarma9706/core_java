package com.stringexamples.com.oop;

public class Outer4 {
    String name  = "james";
    class Inner1
    {
        void show()
        {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        new Outer1().new Inner1().show();



    }
}
