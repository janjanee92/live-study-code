package com.jihan.javastudycode.designpattern.singleton;

public class SingletonEagerInitialization {
    private SingletonEagerInitialization() {}

    private static SingletonEagerInitialization instance = new SingletonEagerInitialization();

    public static SingletonEagerInitialization getInstance() {
        return instance;
    }
}
