package com.driver;
class A{
    String meth(){
        return "Invoking method from class A";
    }
}
class B extends A{
    @Override
    String meth(){
        return "Method is overridden in Extendend class B";
    }
}


public class Main {

    public static void main(String[] args) {
        B b= new B();
        B c= new B();
       // System.out.println(b.meth());
        b.meth();
        c.meth();
        // 2nd sol
    }
}
