package com.stringexamples.com.oop;

public class Program9 {
    static int display (int a, int b )
    {
        System.out.println("hello"); // 1
    }
    static void  show (int a) {
        System.out.println("hi");
    }
    static void visible (int...a) // var-args perameter
    {
        System.out.print("bye");
    }

    public static void main(String[] args)
    {
        Program9.visible( 10,20,30,40,50);
    }
}
