package com.stringexamples.com.oop;

public class Program11 {
    static void visible (int...a) // var-args perameter
    {
        System.out.print(a.length);
        System.out.print(a[0]);
        System.out.print(a[1]);
        System.out.print(a[2]);
        System.out.print(a[a.length-1]);
    }

    public static void main(String[] args)
    {
//        Program9.visible( 10,20,30,40,50);
    }
}
