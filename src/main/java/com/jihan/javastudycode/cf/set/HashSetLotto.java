package com.jihan.javastudycode.cf.set;

import java.util.*;

public class HashSetLotto {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; set.size() < 6; i++) {
            int num = (int)(Math.random() * 45) + 1;
            set.add(num);
        }

        List<Integer> list = new LinkedList<>(set);
        Collections.sort(list);
        System.out.println(list);
    }
}
