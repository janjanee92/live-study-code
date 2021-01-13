package com.jihan.javastudycode.week6;

public class BindingTest {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();

        System.out.println("p.x="+p.x);
        System.out.println("p.s="+p.s);
        p.method();

        System.out.println("c.x="+c.x);
        System.out.println("c.s="+c.s);
        c.method();
    }
}

class Parent {
    static String s = "parent";
    int x = 100;

    void method() {
        System.out.println("Parent Method");
    }
}

class Child extends Parent {
    static String s = "child";
    int x = 200;

    void method() {
        System.out.println("Child Method");
    }
}