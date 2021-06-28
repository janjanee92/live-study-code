package com.jihan.javastudycode.cf;

import java.util.*;

public class IteratorEx {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
//        Collection<String> c = new HashSet<>();

        c.add("hello");
        c.add("world");
        c.add("happy");

        Iterator<String> it = c.iterator();

        while(it.hasNext())
            System.out.println(it.next());

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "dog");
        map.put(2, "cat");
        Iterator<String> it2 = map.values().iterator();
    }
}
