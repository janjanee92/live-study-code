package com.jihan.javastudycode.week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListNodeStackTest {

    @Test
    void push_test () {
        ListNodeStack s = new ListNodeStack();
        s.push(10);
        s.push(20);
        s.push(30);

        assertEquals(3, s.size());
    }

    @Test
    void pop_test () {
        ListNodeStack s = new ListNodeStack();
        s.push(10);
        s.push(20);
        s.push(30);

        int result1 = s.pop();
        int result2 = s.pop();
        int result3 = s.pop();

        assertEquals(30, result1);
        assertEquals(20, result2);
        assertEquals(10, result3);

    }

    @Test
    void pop_empty_stack_test () {
        ListNodeStack s = new ListNodeStack();

        assertThrows(ListNodeStack.EmptyInStackException.class, () -> s.pop());
    }

}