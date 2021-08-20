package com.jihan.javastudycode.designpattern.singleton;

public class Singleton {

    private Singleton() {}

    private static Singleton instance = null;

    public static Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

}
