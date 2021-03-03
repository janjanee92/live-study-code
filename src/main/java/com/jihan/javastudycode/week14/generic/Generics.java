package com.jihan.javastudycode.week14.generic;

import java.util.Arrays;
import java.util.List;

public class Generics {

    static <T> void method1(List<T> list) {

    }

    static void method2(List<?> list) {

    }

    static <T> boolean isEmpty1(List<T> list) {
        return list.size() == 0;
    }


    static boolean isEmpty2(List<?> list) {
        return list.size() == 0;
    }

    static <T> long frequency1(List<T> list, T elem) {
        return list.stream().filter(s -> s.equals(elem)).count();
    }

    static long frequency2(List<?> list, Object elem) {
        return list.stream().filter(s -> s.equals(elem)).count();
    }

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,3);
        System.out.println(isEmpty2(list));
        System.out.println(frequency2(list, 3));

    }

}
