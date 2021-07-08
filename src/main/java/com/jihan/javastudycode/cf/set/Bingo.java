package com.jihan.javastudycode.cf.set;

import java.util.*;

public class Bingo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        int[][] board = new int[5][5];

        for (int i = 0; set.size() < 25; i++) {
            set.add((int)(Math.random() * 50) + 1);
        }

        Iterator<Integer> it = set.iterator();

        for (int[] bo : board) {
            Arrays.stream(bo)
                    .map(b -> it.next())
                    .mapToObj(next -> (next < 10 ? "  " : " ") + next)
                    .forEach(System.out::print);
            System.out.println();
        }
    }
}
