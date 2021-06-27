package com.jihan.javastudycode.cf;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(5);
        pq.offer(10);
        pq.offer(3);
        pq.offer(6);
        pq.offer(2);

        while (!pq.isEmpty())
            System.out.println(pq.poll());
    }
}
