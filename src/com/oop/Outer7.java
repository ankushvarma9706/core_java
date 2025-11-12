package com.stringexamples.com.oop;

// member inner class
public class Outer7 {
    void show()
    {
        class inner7
        {
           void display()
           {
            System.out.println("Hello");
           }
        }
        inner7 obj2 = new inner7();
        obj2.display();
    }

    public static void main(String[] args) {
        Outer7 obj1 = new Outer7();
       obj1.show();



    }
}
