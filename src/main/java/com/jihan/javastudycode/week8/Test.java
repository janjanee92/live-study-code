package com.jihan.javastudycode.week8;

public class Test implements Test1, Test2 {

    @Override
    public void same() {
        Test1.super.same();
        Test2.super.same();
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.same();
    }
}
