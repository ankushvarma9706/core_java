package com.stringexamples;

import java.util.Locale;

public class Program5 {
    public static void main(String[] args)
    {
        String a = "hello";
        a = a.toUpperCase(Locale.ROOT);
        for(int i = 0 ; i<a.length(); i++){
            System.out.print((int)a.charAt(i)-64);
        }

    }
}
