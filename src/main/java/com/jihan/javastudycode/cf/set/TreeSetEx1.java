package com.jihan.javastudycode.cf.set;

import java.util.TreeSet;

public class TreeSetEx1 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        String from = "b";
        String to = "d";

        set.add("abc");
        set.add("apple");
        set.add("banana");
        set.add("bowl");
        set.add("box");
        set.add("cat");
        set.add("cow");
        set.add("dry");
        set.add("drill");
        set.add("email");
        set.add("entry");
        set.add("file");
        set.add("feed");

        System.out.println(set);
        System.out.println("range search: from " + from + " to " + to);
        System.out.println("result1 : " + set.subSet(from, to));

    }
}
