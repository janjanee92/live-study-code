package com.jihan.javastudycode.week9;

public class ExceptionEx2 {
    public static void main(String[] args) {
        int number = 100;
        int result;

        for (int i = 0; i < 10; i++) {
            result = number / (int)(Math.random() * 10);
            System.out.println(result);
        }
    }
}
