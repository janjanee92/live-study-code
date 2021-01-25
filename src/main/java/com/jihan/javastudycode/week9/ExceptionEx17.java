package com.jihan.javastudycode.week9;

public class ExceptionEx17 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main 메소드에서 예외 처리 완료.");
        }
    }

    private static void method1() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1 메서드에서 예외 처리완료.");
            throw e;
        }
    }
}
