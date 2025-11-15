package com.stringexamples.com.oop3;

public class RTO {
void  numberPlates ()
{
    System.out.println("white in color ");
}
}
class Public extends RTO {

    public static void main(String[] args) {
        RTO p1 = new Public() ;
        p1.numberPlates();
    }
}

class Army extends RTO
{
    void numberPlates  ()
    {
        System.out.println("Black in color ");
    }
    public static void main(String[] args)
    {
      RTO p1 = new Army();
      p1.numberPlates();
    }
}