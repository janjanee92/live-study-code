package com.jihan.javastudycode.week8;

public interface PrivateTest {
    default void printHello() {
        print("Hello");
    }
    
    default void printHi() {
        print("Hi");
    }

    private void print(String s) {
        System.out.println(s);
    }
}
