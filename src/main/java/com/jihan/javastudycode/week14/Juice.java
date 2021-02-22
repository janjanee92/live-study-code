package com.jihan.javastudycode.week14;

public class Juice {

    String name;

    Juice(String name) {
        this.name = name + "Juice";
    }

    @Override
    public String toString() {
        return name;
    }
}
