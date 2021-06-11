package com.jihan.javastudycode.week4;

import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class IntStackTest {

    @Test
    void push_test () {
        IntStack s = new IntStack(10);
        s.push(10);
        s.push(20);

        assertEquals(2, s.size());
    }

    @Test
    void push_overflow_test () {
        IntStack s = new IntStack(3);
        s.push(10);
        s.push(20);
        s.push(30);

        assertThrows(StackOverflowError.class, ()-> s.push(40));

    }

    @Test
    void pop_test () {
        IntStack s = new IntStack(5);

        s.push(10);
        s.push(20);

        int result1 = s.pop();
        int result2 = s.pop();

        assertEquals(20, result1);
        assertEquals(10, result2);
    }

    @Test
    void pop_empty_stack_test () {
        IntStack s = new IntStack(5);

        assertThrows(EmptyStackException.class, () -> s.pop());
    }
}