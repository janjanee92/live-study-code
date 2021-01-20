package com.jihan.javastudycode.week8;

public class Doraemon extends Character implements Magical{
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
