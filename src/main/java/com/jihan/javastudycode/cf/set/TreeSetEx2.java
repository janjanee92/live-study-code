package com.jihan.javastudycode.cf.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        int[] score = {88, 95, 70, 30, 50, 60, 100, 10, 47};

        for (int s : score) {
            set.add(s);
        }

        System.out.println("60 미만 : " + set.headSet(60));
        System.out.println("60 이상 : " + set.tailSet(60));

    }
}
