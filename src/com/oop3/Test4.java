package com.stringexamples.com.oop3;

public class Test4 {
    void show(int a , String b)  // Signature => show()
    {
        System.out.println("Method-1");
    }
    void show(String b , int a ) // Signature => show(int)
    {
        System.out.println("Method-2");
    }

    public static void main(String[] args)
    {
        Test1  ti = new Test1();
        ti.show();
        ti.show(100);

    }
}
