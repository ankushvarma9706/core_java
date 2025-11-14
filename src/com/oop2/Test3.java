package com.stringexamples.com.oop2;

public class Test3 {

int a = 100 ;
}
class Test4 extends Test3 {
    int a = 200 ;
    public static void main(String[] args) {
        Test4 t1 = new Test4();
        System.out.println(t1.a);

    }
}