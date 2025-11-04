package com.stringexamples.cfs;
import java.util.Scanner;
public class Calcy {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int operator , num1 , num2 ;
        System.out.print("choose your opration :  1 - add  /n  2 - sustact  /n  3 - multiply  /n 4 - divde  5 - reminder /n  ");
        operator = sc.nextInt();
      System.out.print("enter the first no : ");
      num1 = sc.nextInt() ;
      System.out.print("enter the second no : ");
      num2 = sc.nextInt() ;
      int result = 0 ;
        switch (operator )
        {
            case 1 :
                result = num1+num2 ;
                break;
            case 2 :
                result = num1-num2 ;
                break;
            case 3 :
                result = num1*num2 ;
                break;
            case 4 :
                result = num1/num2 ;
                break;
            case 5 :
                result = num1%num2 ;
                break;
        }
        System.out.print("The result is : " + result  );
    }

}
