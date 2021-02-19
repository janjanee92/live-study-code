package com.jihan.javastudycode.designpattern.decorator;

public class DarkRoast extends Beverage {

    public DarkRoast () {
        setDescription("다크 로스트");
    }

    @Override
    public int cost() {
        return 4500;
    }
}
