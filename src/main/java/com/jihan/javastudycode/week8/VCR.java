package com.jihan.javastudycode.week8;

public class VCR {
    protected int counter;

    public void play() {
        System.out.println("play");
    }

    public void stop () {
        System.out.println("stop");
    }

    public void reset() {
        counter = 0;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter (int c) {
        counter = c;
    }
}
