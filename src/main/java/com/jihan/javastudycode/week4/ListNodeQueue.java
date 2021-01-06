package com.jihan.javastudycode.week4;

public class ListNodeQueue {

    private LinkedList li;

    public class EmptyIntAryQueueException extends RuntimeException {
        public EmptyIntAryQueueException() {}
    }

    public ListNodeQueue() {
        this.li = new LinkedList();
    }

    public void enque(int x) {
        li.add(x);
    }

    public int deque() {
        ListNode returnData = li.removeFirst();

        if (returnData == null)
            throw new EmptyIntAryQueueException();

        return returnData.getData();
    }

    public int size() {
        return li.size();
    }

}
