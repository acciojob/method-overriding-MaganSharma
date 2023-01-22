package com.driver;
class A{
    public A() {
    }

    String meth(){
        return "Invoking method from class A";
    }
}
class B extends A{
    public B() {
    }

    @Override
    String meth() {
        return "Method is overridden in Extendend class B";
    }
}


public class Main {

    public static void main(String[] args) {
        B b= new B();
        b.meth();
       // c.meth();
        // 2nd sol
    }
}
