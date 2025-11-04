package com.stringexamples.com.oop;

public class Program4 {
    void show (){
        System.out.println("hi");
    }
    static  void display (){
        System.out.println("hello");
    }
    public static void main(String[] args)
    {
        System.out.println("bye"); // bye

//        named object
        Program4 obj1 = new Program4();
        obj1.show();

//        nameless object
        new Program4().show();

    }
}
