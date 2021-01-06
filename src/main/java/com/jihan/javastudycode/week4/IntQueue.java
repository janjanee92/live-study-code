package com.jihan.javastudycode.week4;

public class IntQueue {

    public class EmptyIntAryQueueException extends RuntimeException {
        public EmptyIntAryQueueException() {
        }
    }

    public class OverflowIntAryQueueException extends RuntimeException {
        public OverflowIntAryQueueException() {
        }
    }

    private int max;
    private int num = 0;
    private int[] que;

    public IntQueue(int capacity) {
        max = capacity;
        try {
            que = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public int enque(int x) throws OverflowIntAryQueueException {
        if (num == max)
            throw new OverflowIntAryQueueException();
        que[num++] = x;
        return x;
    }

    public int deque() throws EmptyIntAryQueueException {
        if (num <= 0)
            throw new EmptyIntAryQueueException();
        int x = que[0];
        for (int i = 0; i < num - 1; i++)
            que[i] = que[i + 1];
        num--;
        return x;
    }

    public int size() {
        return num;
    }

}
