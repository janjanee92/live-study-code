package com.jihan.javastudycode.week9;

public class ExceptionEx9 {
    public static void main(String[] args) {
        try {
            throw new Exception("Error!!!");
        } catch (Exception e) {
            System.out.println("에러메시지: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
