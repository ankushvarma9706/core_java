package com.stringexamples;

import java.util.Locale;

public class Program6 {
    public static void main(String[] args) {
        String a = "Hello";
        int sum = 0 ;
        a = a.toUpperCase(Locale.ROOT);
        for (int i = 0; i < a.length()/2; i++) {
            int ch1 = a.charAt(i)-64 ;
            int ch2 = a.charAt(a.length()-1)-64 ;
            int diff = Math.abs(ch1-ch2) ;
            sum = sum +diff ;
        }
        if (a.length()%2 != 0){
            int ch3 = a.charAt(a.length()/2)-64 ;
            sum = sum+ch3;
        }
        System.out.println(sum);
    }
}