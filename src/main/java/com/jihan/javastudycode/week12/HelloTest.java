package com.jihan.javastudycode.week12;


import annotation.Hello;

public class HelloTest {

    @Hello
    public void helloString() {
        System.out.println("hello");
    }

    @Hello
    public String helloHi() {
        return "hello hi";
    }

    public static void main(String[] args) {
        System.out.println("Hello Method~~~!~!~@");
    }

}
