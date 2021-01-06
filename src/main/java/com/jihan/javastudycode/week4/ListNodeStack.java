package com.jihan.javastudycode.week4;

public class ListNodeStack {

    private LinkedList li;

    public class EmptyInStackException extends RuntimeException {
        public EmptyInStackException() {}
    }

    public ListNodeStack() {
        this.li = new LinkedList();
    }

    public void push(int x) {
        li.add(x);
    }

    public int pop() {
        ListNode returnData = li.removeLast();

        if (returnData == null)
            throw new EmptyInStackException();

        return returnData.getData();
    }

    public int size() {
        return li.size();
    }

}
