package com.jihan.javastudycode.week4;

public class Participant {

    String id;

    int count;

    public Participant(String id) {
        this.id = id;
        this.count = 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate(int week) {
        return this.count * 100 / (double)week;
    }
}
