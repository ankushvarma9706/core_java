package com.stringexamples.cfs;

public class Example7 {
    public static void main(String[] args)
    {
        int a = 10 ;
//        double = 10 .5  ; invalid
        switch (a+100) // byte + int = int
        {
            case 10 :
                System.out.println("hello") ;
            case 100 :
                System.out.println("hi") ;
            case 1000 :
                System.out.println("bye") ;
                break;
        }
    }
}

