package com.jihan.javastudycode.designpattern.singleton;

public class SingletonLazyHolder {

    private SingletonLazyHolder() {}

    public static SingletonLazyHolder getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        private static final SingletonLazyHolder INSTANCE = new SingletonLazyHolder();
    }
}

