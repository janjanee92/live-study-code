package com.jihan.javastudycode.lang;

public class StringEx {
    public static void main(String[] args) {

        String hi = "hi";
        String there = "there";
        hi = hi + there;

        String s1 = "hi";
        String s2 = "hi";
        String s3 = new String("hi");
        String s4 = new String("hi");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));

    }
}
