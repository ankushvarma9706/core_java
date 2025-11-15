package com.stringexamples.com.oop4;

public abstract class Test3 {
    abstract void show();

    void display() {
        System.out.println("hello");
    }
}
    class Test4 extends Test3
    {

        @Override
        void show()
        {
         System.out.println("Method-show");
        }
        public static void main(String[] args)
        {
            Test3 t1  = new Test4() ;
            t1.display();
            t1.show();


    }
}
