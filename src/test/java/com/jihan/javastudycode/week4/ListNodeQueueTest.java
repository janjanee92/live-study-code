package com.jihan.javastudycode.week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListNodeQueueTest {

    @Test
    void enque_test () {
        ListNodeQueue q = new ListNodeQueue();

        q.enque(10);
        q.enque(20);
        q.enque(30);

        assertEquals(3, q.size());
    }

    @Test
    void deque_test () {
        ListNodeQueue q = new ListNodeQueue();
        
        q.enque(10);
        q.enque(20);
        q.enque(30);

        int result1 = q.deque();
        int result2 = q.deque();
        int result3 = q.deque();

        assertEquals(10, result1);
        assertEquals(20, result2);
        assertEquals(30, result3);

    }

    @Test
    void deque_empty_stack_test () {
        ListNodeQueue q = new ListNodeQueue();

        assertThrows(ListNodeQueue.EmptyIntAryQueueException.class, q::deque);
    }
}