package com.stringexamples.com.oop3;

public class Test3 {
    int add (int a , int b )  // Signature => show()
    {
        return a+b ;
    }
    int add (int a , int b , int c  ) // Signature => show(int)
    {

        return a+b+c ;
    }
    int add (int a , int b , int c , int d ) // Signature => show(int)
    {

        return a+b+c+d ;
    }

    public static void main(String[] args)
    {
        Test3  t1 = new Test3();
       System.out.println(t1.add(10 ,20));
       System.out.println(t1.add(10 ,20,30));
       System.out.println(t1.add(10 ,20,30,40));

    }
}
