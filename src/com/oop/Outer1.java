package com.stringexamples.com.oop;

public class Outer1 {
     class Inner1
     {
         void show()
         {
             System.out.println("Hello");
         }
     }

    public static void main(String[] args) {
         Outer1 obj1 = new Outer1();
         Outer1.Inner1 obj2 = obj1.new Inner1();
         obj2.show();


    }
}
