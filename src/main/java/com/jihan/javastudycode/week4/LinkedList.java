package com.jihan.javastudycode.week4;

public class LinkedList {
    private ListNode head;
    private int size = 0;

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

            ListNode preNode = ListNode.node(head, index - 1);

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
        if (head == null)
            return null;

        ListNode temp = head;

        head = head.getNext();

        size--;

        return temp;
    }

    public ListNode remove(int index) {
        if (index == 0) {
            return removeFirst();
        } else {
            ListNode preNode = ListNode.node(head, index -1);

            if (preNode == null) {
                return null;
            }

            ListNode removed = preNode.getNext();
            preNode.setNext(removed.getNext());

            size--;

            return removed;
        }
    }

    public ListNode removeLast() {
        if (size == 1) {
            return removeFirst();
        }
        return remove(size-1);
    }

    public int size() {
        return size;
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

        StringBuilder str = new StringBuilder("[");

        while (temp.getNext() != null) {
            str.append(temp).append(",");
            temp = temp.getNext();
        }

        str.append(temp);

        return str + "]";
    }
}
