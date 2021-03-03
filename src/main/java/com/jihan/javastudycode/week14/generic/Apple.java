package com.jihan.javastudycode.week14.generic;

public class Apple extends Entity<Integer> {

    public static Apple of(Integer id) {
        Apple apple = new Apple();
        apple.id = id;
        return apple;
    }
}
