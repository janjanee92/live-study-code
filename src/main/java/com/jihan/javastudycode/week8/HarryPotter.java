package com.jihan.javastudycode.week8;

public class HarryPotter extends Character implements Magical{
    MagicalImpl m = new MagicalImpl();

    @Override
    public void teleport() {
        m.teleport();
    }

    @Override
    public void fly() {
        m.fly();
    }
}
