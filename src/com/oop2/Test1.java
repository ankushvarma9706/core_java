package com.stringexamples.com.oop2;

public class Test1 {
    int a = 100 ;
}
class Test2 extends Test1 {
    public static void main(String[] args) {
        Test2 t1 = new Test2() ;
        System.out.println(t1.a);

    }
}
