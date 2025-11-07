package com.stringexamples.com.oop;

public class Program10 {
//    Var-arg perameter should be last perameter in the method
//    dont use more then one Var-arg perameter in a method
    static void visible (int...a) // var-args perameter
    {
        System.out.print("bye");
    }

    public static void main(String[] args)
    {
        Program9.visible( 10,20,30,40,50);
    }
}
