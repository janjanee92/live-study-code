package com.jihan.javastudycode.week4;

import java.util.EmptyStackException;

public class IntStack {

    private int max;
    private int ptr;
    private int[] stk;

    public IntStack (int capacity) {
        ptr = 0;
        max = capacity;
        try {
            stk = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public void push(int x) {
        if (ptr == max)
            throw new StackOverflowError();
        stk[ptr++] = x;
    }

    public int pop() {
        if (ptr <= 0)
            throw new EmptyStackException();
        return stk[--ptr];
    }

    public int size() {
        return ptr;
    }

}
