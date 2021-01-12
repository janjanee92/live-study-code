package com.jihan.javastudycode.week6;

public class StaticDispatch {

    static class Service {
        void run(int number) {
            System.out.println("run(" + number + ")");
        }

        void run(String msg) {
            System.out.println("run(" + msg + ")");
        }
    }

    public static void main(String[] args) {
        new Service().run(10);
        new Service().run("hello");
    }

}

