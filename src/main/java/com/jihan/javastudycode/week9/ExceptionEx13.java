package com.jihan.javastudycode.week9;

public class ExceptionEx13 {
    public static void main(String[] args) throws Exception {
        method1();
    }

    private static void method1() throws Exception {
        method2();
    }

    private static void method2() throws Exception {
        throw new Exception();
    }
}
