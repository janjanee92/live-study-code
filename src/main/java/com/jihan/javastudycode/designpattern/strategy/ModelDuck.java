package com.jihan.javastudycode.designpattern.strategy;

public class ModelDuck extends Duck {

    public ModelDuck () {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("저는 모형오리 입니다.");
    }
}
