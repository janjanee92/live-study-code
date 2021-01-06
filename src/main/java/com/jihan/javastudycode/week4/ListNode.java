package com.jihan.javastudycode.week4;

public class ListNode {
    private int data;

    private ListNode next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode(int input) {
        this.data = input;
        this.next = null;
    }

    public static ListNode node (ListNode head, int index) {
        ListNode x = head;
        for (int i = 0; i < index; i++) {

            if (x == null) {
                return null;
            }

            x = x.getNext();
        }
        return x;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}