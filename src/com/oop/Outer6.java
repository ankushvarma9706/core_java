package com.stringexamples.com.oop;

public class Outer6 {
    String name  = "james";
    class Inner1
    {
        String name  = "Peter";
        void show()
        {
            System.out.println(Outer6.this.name);
        }
    }

    public static void main(String[] args) {
        new Outer1().new Inner1().show();



    }
}
