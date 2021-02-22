package com.jihan.javastudycode.week14;

public class Kiwi extends Fruit implements Comparable<Kiwi> {

    public Kiwi() {
    }

    public Kiwi(String name, int weight) {
        super(name, weight);
    }

    @Override
    public int compareTo(Kiwi o) {
        return o.weight - this.weight;
    }
}
