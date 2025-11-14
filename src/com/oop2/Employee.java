package com.stringexamples.com.oop2;

public class Employee {
    int s = 10000 ;
}
class HR extends Employee {
    int bonus = 5000 ;


    public static void main(String[] args) {
        Employee t1 = new HR();
        HR t2 = new HR ();
        int salary = t1.s + t2.bonus ;
        System.out.println(salary);

    }
}
class Account extends Employee
{
    int bonus = 4000;

    public static void main(String[] args) {
        Employee t1 = new Account();
       Account t2 = new Account();
       int salary = t1.s + t2.bonus ;
        System.out.println(salary);


    }
}

