package com.stringexamples.com.recusion;

public class Program6 {
    static int m1(int num)
    {
        if(num>100){
            return num-10 ;
        }
        else {
           return m1(m1(num+11));
        }
    }
    public static void main(String[] args)
    {
       System.out.println(Program6.m1(95));
    }
}

