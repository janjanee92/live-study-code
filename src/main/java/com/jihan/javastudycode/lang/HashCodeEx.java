package com.jihan.javastudycode.lang;

public class HashCodeEx {
    public static void main(String[] args) {
        String s1 = new String("hi");
        String s2 = new String("hi");

        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
    }


}
