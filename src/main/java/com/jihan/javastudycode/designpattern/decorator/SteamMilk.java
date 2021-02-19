package com.jihan.javastudycode.designpattern.decorator;

public class SteamMilk extends ToppingDecorator {

    Beverage beverage;

    public SteamMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return 700 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 스팀 밀크";
    }
}
