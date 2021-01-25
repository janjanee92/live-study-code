package com.jihan.javastudycode.week9;

public class FinallyTest {
    public static void main(String[] args) {
        try {
            System.out.println("hello~");
            return;
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        } finally {
            System.out.println("finally: bye!");
        }
    }
}
