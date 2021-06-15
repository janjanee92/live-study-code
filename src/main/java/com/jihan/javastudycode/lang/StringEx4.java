package com.jihan.javastudycode.lang;

import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;

public class StringEx4 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("0123456");
        sb.reverse();
        System.out.println(sb);

        sb.setLength(50);
        System.out.println(sb);

        System.out.println(sb.capacity());
        System.out.println(sb.length());

        StringBuffer sb2 = new StringBuffer("hi");
        System.out.println(sb2.capacity());
        System.out.println(sb2.length());

        StringBuffer sb3 = new StringBuffer(30);
        System.out.println(sb3.capacity());
        System.out.println(sb3.length());

        sb.append("123")
                .append("world");

        StringBuffer sb4 = new StringBuffer("abc");
        StringBuffer sb5 = new StringBuffer("abc");
        System.out.println(sb4 == sb5);
        System.out.println(sb4.equals(sb5));

        String s = sb.toString();
        String s2 = sb2.toString();

        System.out.println(s.equals(s2));

    }
}
