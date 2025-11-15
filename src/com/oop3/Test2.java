package com.stringexamples.com.oop3;

public class Test2 {
    void show()  // Signature => show()
    {
        System.out.println("Method-1");
    }
    // If return type is change , no matter in the Overloading

    int show(int a ) // Signature => show(int)
    {
        System.out.println("Method-2");
        return a = 100 ;
    }

    public static void main(String[] args)
    {
        Test1  ti = new Test1();
        ti.show();
        ti.show(100);

    }
}
