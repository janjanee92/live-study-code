package com.jihan.javastudycode.designpattern.decorator;

public class HouseBlend extends Beverage {

    public HouseBlend () {
        setDescription("하우스 블렌드");
    }

    @Override
    public double cost() {
        return .89;
    }
}
