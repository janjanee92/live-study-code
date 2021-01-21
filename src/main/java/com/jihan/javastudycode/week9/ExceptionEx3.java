package com.jihan.javastudycode.week9;

public class ExceptionEx3 {
    public static void main(String[] args) {
        int number = 100;
        int result;

        for (int i = 0; i < 10; i++) {
            try {
                result = number / (int)(Math.random() * 10);
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("0으로 나누는건 안됨!");
            }
        }
    }
}
