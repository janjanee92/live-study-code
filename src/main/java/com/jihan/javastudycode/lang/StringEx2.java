package com.jihan.javastudycode.lang;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

public class StringEx2 {
    public static void main(String[] args) {
        String s1 = "hi";
        String s2 = "hi";
        String s3 = "hello";

        String str = "";
        char[] chArr = new char[0];
        int[] iArr = {};
        str.toCharArray();

        String a = new String("미안해요 날 위해");
        byte[] bytes = a.getBytes(StandardCharsets.UTF_8);
        for (byte b : bytes) {
            System.out.println(b);
        }

        char[] c = {'H', 'e', 'l', 'l', 'o'};
        String hello = new String(c);
        c = hello.toCharArray();

        char c1 = hello.charAt(1);
        System.out.println(c1);

        int hello1 = hello.compareTo("apple");
        System.out.println(hello1);

        String helloWorld = hello.concat(" World");

        boolean result = helloWorld.contains("lo");
        System.out.println(result);

        boolean world = helloWorld.endsWith("World");
        System.out.println(world);

        boolean hello2 = helloWorld.startsWith("Hello");
        System.out.println(hello2);

        boolean hello3 = hello.equalsIgnoreCase("HELLO");
        System.out.println(hello3);

        int index = hello.indexOf('l');
        System.out.println(index);

        int world1 = helloWorld.indexOf("World");
        System.out.println(world1);

        int d = "java.lang.java".lastIndexOf("java");
        int java = "java.lang.java".indexOf("java");
        System.out.println(d);
        System.out.println(java);

        int length = helloWorld.length();
        System.out.println(length);

        String animals = "dog,cat,bear";
        String[] arr = animals.split(",", 2);
        System.out.println(Arrays.toString(arr));

        String o = "java.lang.Object";
        String object = o.substring(10);
        System.out.println(object);
        System.out.println(o.substring(5, 9));

        System.out.println("Hello".toLowerCase());
        System.out.println("hello".toUpperCase());

        String trim = "    hi hello  ".trim();
        System.out.println(trim);

        String bool = String.valueOf(true);
        String i = String.valueOf(100);
        String.valueOf('a');
        System.out.println(i);

    }
}
