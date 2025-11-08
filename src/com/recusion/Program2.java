package com.stringexamples.com.recusion;

public class Program2 {
    static void m1(int num)
    {
        if(num>0){
            m1(num-1);
            System.out.print(num);
        }
    }
    public static void main(String[] args)
    {
        Program1.m1(5);
    }
}
