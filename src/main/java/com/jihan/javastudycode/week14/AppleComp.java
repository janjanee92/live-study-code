package com.jihan.javastudycode.week14;

import java.util.Comparator;

public class AppleComp implements Comparator<Apple> {

    @Override
    public int compare(Apple a1, Apple a2) {
        return a2.weight - a1.weight;
    }
}
