package com.stringexamples.com.oop3;

import com.stringexamples.com.oop4.Test3;

public abstract class Test5 {
    abstract void show();

    void display()
    {
        System.out.println("hello");
    }
}
abstract class Test6 extends Test5
{
    abstract void  add ( int a , int b);
}
class Test7 extends Test6
{

    @Override
    void show()
    {
        System.out.println("Method-show");
    }


    @Override
    void add(int a, int b)
    {
     System.out.println(a+b);
    }
    public static void main(String[] args) {
        Test7 t1 = new Test7();
        t1.display();
        t1.show();
        t1.add(10, 20);
    }
}


