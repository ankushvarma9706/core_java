package com.stringexamples.com.recusion;

public class Program1 {
    static void m1(int num)
    {
        if(num>0){
            System.out.print(num);
            m1(num-1);
        }
    }
    public static void main(String[] args)
    {
        Program1.m1(5);
    }
}
