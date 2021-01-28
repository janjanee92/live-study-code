package com.jihan.javastudycode.week10;

public class ThreadEx1 {
    public static void main(String[] args) {

        ThreadEx1_1 t1 = new ThreadEx1_1();
        Thread t2 = new Thread(new ThreadEx1_2(), "hello");

        t1.start();
        t1= new ThreadEx1_1();
        t1.start();
        t2.start();

    }
}

class ThreadEx1_1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName());
        }
    }
}

class ThreadEx1_2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
