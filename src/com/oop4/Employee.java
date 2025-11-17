package com.stringexamples.com.oop4;

public interface Employee
{
void show();
}
 interface Boss
{
    void Display();
}
class Manger implements Boss,Employee {

    @Override
    public void show() {
        System.out.println("Implementation of show() method in  Manager");

    }

    @Override
    public void Display() {
        System.out.println("Implementation of Display() method in  Manager");
    }
}
class Test8
{
    public static void main(String[] args)
    {
        Employee m1 = new Manger();
        Boss m2 = new Manger();
        m2.Display();
        m1.show();

    }
}



