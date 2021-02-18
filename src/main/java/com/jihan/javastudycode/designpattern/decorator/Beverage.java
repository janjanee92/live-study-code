package com.jihan.javastudycode.designpattern.decorator;

public abstract class Beverage {

    private String description = "제목없음";

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
