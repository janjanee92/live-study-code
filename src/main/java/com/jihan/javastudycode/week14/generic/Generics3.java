package com.jihan.javastudycode.week14.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generics3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        reverse(list);
        System.out.println(list);
    }

    static void reverse(List<?> list) {
        List temp = new ArrayList<>(list);
        List list2 = list;
        for (int i = 0; i < list.size(); i++) {
            list2.set(i, temp.get(list2.size() - i - 1));
        }
    }
}
