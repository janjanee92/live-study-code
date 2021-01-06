package com.jihan.javastudycode.week4;

public class IntStack {

    private int max;
    private int ptr;
    private int[] stk;

    public class EmptyInStackException extends RuntimeException {
        public EmptyInStackException() {}
    }

    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {}
    }

    public IntStack (int capacity) {
        ptr = 0;
        max = capacity;
        try {
            stk = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public void push(int x) throws OverflowIntStackException {
        if (ptr == max)
            throw new OverflowIntStackException();
        stk[ptr++] = x;
    }

    public int pop() throws EmptyInStackException {
        if (ptr <= 0)
            throw new EmptyInStackException();
        return stk[--ptr];
    }

    public int size() {
        return ptr;
    }

}
