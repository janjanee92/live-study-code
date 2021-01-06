package com.jihan.javastudycode.week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntQueueTest {

    @Test
    void enque_test () {
        IntQueue q = new IntQueue(10);
        q.enque(10);
        q.enque(20);

        assertEquals(2, q.size());
    }

    @Test
    void enque_overflow_test () {
        IntQueue q = new IntQueue(3);
        q.enque(10);
        q.enque(20);
        q.enque(30);

        assertThrows(IntQueue.OverflowIntAryQueueException.class, ()-> q.enque(40));

    }

    @Test
    void deque_test () {
        IntQueue q = new IntQueue(2);

        q.enque(10);
        q.enque(20);

        int result1 = q.deque();
        int result2 = q.deque();

        assertEquals(10, result1);
        assertEquals(20, result2);
    }

    @Test
    void deque_empty_stack_test () {
        IntQueue q = new IntQueue(5);

        assertThrows(IntQueue.EmptyIntAryQueueException.class, q::deque);
    }

}