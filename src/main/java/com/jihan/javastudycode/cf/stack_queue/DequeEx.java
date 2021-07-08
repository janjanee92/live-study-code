package com.jihan.javastudycode.cf.stack_queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        //  Queue mode
        deque.offerLast(1);
        deque.offerLast(2);
        deque.offerLast(3);

        int one = deque.pollFirst();
        int two = deque.pollFirst();

        System.out.println(one);
        System.out.println(two);
        System.out.println(deque);

        //  Stack mode
        deque.offerLast(4);
        deque.offerLast(5);

        int five = deque.pollLast();
        int four = deque.pollLast();
        System.out.println(five);
        System.out.println(four);
        System.out.println(deque);
    }
}
