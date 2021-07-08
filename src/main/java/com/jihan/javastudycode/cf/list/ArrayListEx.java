package com.jihan.javastudycode.cf.list;

import java.util.*;

public class ArrayListEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("cat");
        list.add("hi");
        list.add("dog");
        list.add("good");
        list.add("friends");

        System.out.println(list.size());   //  6
        System.out.println(list.get(3));   //  dog
        list.remove(3);
        list.remove("cat");
        System.out.println(list);   //  [hello, hi, good, friends]

        List<String> companies = Arrays.asList("google", "apple", "samsung");
        System.out.println(companies);  //  [google, apple, samsung]

        List<Integer> numbers = Arrays.asList(1, 10, 100);
        System.out.println(numbers);  //  [1, 10, 100]
    }
}
