package com.jihan.javastudycode.designpattern.decorator;

public class Espresso extends Beverage {

    public Espresso () {
        setDescription("에스프레소");
    }

    @Override
    public int cost() {
        return 4000;
    }
}
