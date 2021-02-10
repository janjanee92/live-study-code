package com.jihan.javastudycode.week12;

public class Service {

    @PrintAnnotation
    public void method1() {
        System.out.println("method 1");
    }

    @PrintAnnotation("*")
    public void method2() {
        System.out.println("method 2");
    }

    @PrintAnnotation(value="#", number=20)
    public void method3() {
        System.out.println("method 3");
    }

}
