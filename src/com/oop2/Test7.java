package com.stringexamples.com.oop2;

public class Test7 {
//    public final  class Test7 {
    int a = 100 ;
}
class Test8 extends Test7 {
    int a = 200 ;
    public static void main(String[] args) {
        Test7 t1 = new Test8();
        System.out.println(t1.a);

    }
}
class Test9 extends Test7
{
    int a = 300;

    public static void main(String[] args) {
        Test7 t1 = new Test9();
        System.out.println(t1.a);

    }
}