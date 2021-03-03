package com.jihan.javastudycode.week14.generic;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Generics2 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,2,4);
        System.out.println(max(list));

        System.out.println(Collections.max(list,
                (Comparator<Object>)(a, b) -> a.toString().compareTo(b.toString())));
    }

    static <T extends Comparable<? super T>> T max(List<? extends T> list) {
        return list.stream().reduce((a, b)-> a.compareTo(b) > 0 ? a : b).get();
    }
}
