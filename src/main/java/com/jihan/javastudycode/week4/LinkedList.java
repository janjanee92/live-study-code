package com.jihan.javastudycode.week4;

public class LinkedList {
    private ListNode head;
    private int size = 0;

    ListNode node (int index) {
        ListNode x = head;
        for (int i = 0; i < index; i++) {

            if (x == null) {
                return null;
            }

            x = x.getNext();
        }
        return x;
    }

    public ListNode addFirst(int input) {
        ListNode newNode = new ListNode(input);
        newNode.setNext(head);
        head = newNode;
        size++;
        return newNode;
    }

    public ListNode add(int index, int input) {
        if (index == 0) {
            return addFirst(input);
        } else {
            ListNode newNode = new ListNode(input);

            ListNode preNode = node(index - 1);

            if (preNode == null) {
                return null;
            }

            newNode.setNext(preNode.getNext());
            preNode.setNext(newNode);
            size++;

            return newNode;
        }
    }

    public ListNode add(int input) {
        if (size == 0) {
            return addFirst(input);
        } else {
            return add(size, input);
        }
    }

    public ListNode removeFirst() {
        ListNode temp = head;
        head = head.getNext();

        temp = null;
        size--;

        return temp;
    }

    public ListNode remove(int index) {
        if (index == 0) {
            return removeFirst();
        } else {
            ListNode preNode = node(index -1);

            if (preNode == null) {
                return null;
            }

            ListNode removed = preNode.getNext();
            preNode.setNext(removed.getNext());

            size--;
            removed = null;

            return removed;
        }
    }

    public int indexOf(int data) {
        ListNode temp = head;
        int index = 0;

        while(temp.getData() != data) {
            temp = temp.getNext();
            index++;
            if (temp == null) {
                return -1;
            }
        }
        return index++;
    }

    public boolean contains(int data) {
        return indexOf(data) > -1;
    }

    @Override
    public String toString() {
        ListNode temp = head;

        String str = "[";

        while (temp.getNext() != null) {
            str += temp + ",";
            temp = temp.getNext();
        }

        str += temp;

        return str + "]";
    }
}
