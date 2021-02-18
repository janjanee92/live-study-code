package com.jihan.javastudycode.designpattern.decorator;

public class Decaf extends Beverage {

    public Decaf () {
        setDescription("디카페인");
    }

    @Override
    public double cost() {
        return 1.05;
    }

}
