package com.stringexamples.com.oop;

public class Program22 {

    Program22()
    {
       this(100) ;
       System.out.println("Constructor 1 ");
    }
    Program22(int a )
    {
        this(10,"abc") ;
        System.out.println("Constructor 2 ");
    }
    Program22(int a , String b )
    {
        System.out.println("Constructor 3 ");
    }
    public static void main(String[] args) {

        Program22 p1 = new Program22();



    }
}
