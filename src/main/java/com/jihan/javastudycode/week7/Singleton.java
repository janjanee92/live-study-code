package com.jihan.javastudycode.week7;

public class Singleton {

    private static Singleton s = new Singleton();

    private Singleton () {}

    public static Singleton getInstance() {
        return s;
    }
}
