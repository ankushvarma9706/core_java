package com.stringexamples.com.oop;

public class Program20 {
    String  name  ;
    Program20(String  firstname)
    {
        name = firstname;
    }
    public static void main(String[] args) {

        Program20 p1 = new Program20("james");
        System.out.println(p1.name);

    }
}
