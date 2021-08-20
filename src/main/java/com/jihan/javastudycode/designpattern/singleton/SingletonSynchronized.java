package com.jihan.javastudycode.designpattern.singleton;

public class SingletonSynchronized {

    private SingletonSynchronized() {}

    private static SingletonSynchronized instance = null;

    public synchronized static SingletonSynchronized getInstance() {

        if (instance == null) {
            instance = new SingletonSynchronized();
        }

        return instance;
    }
}
