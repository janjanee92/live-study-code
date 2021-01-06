package com.jihan.javastudycode.week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void add_test () {

        LinkedList linkedList = new LinkedList();
        ListNode head = linkedList.add(10);
        ListNode second = linkedList.add(20);
        linkedList.add(2,30);
        linkedList.add(3,40);


        assertEquals(10, head.getData());
        assertEquals(second.getData(), head.getNext().getData());
        assertEquals(30, second.getNext().getData());
        assertEquals(40, second.getNext().getNext().getData());

    }

    @Test
    void add_out_of_index_test () {
        LinkedList linkedList = new LinkedList();

        ListNode head = linkedList.add(100);
        ListNode second = linkedList.add(1, 20);
        ListNode third = linkedList.add(1000, 30);

        assertNull(third);
    }


    @Test
    void remove_test () {
        LinkedList linkedList = new LinkedList();

        ListNode head = linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        ListNode removed1 = linkedList.remove(2);
        ListNode removed2 = linkedList.removeLast();
        ListNode removed3 = linkedList.removeLast();

        assertEquals(30, removed1.getData());
        assertEquals(20, removed2.getData());
        assertEquals(10, removed3.getData());
    }

    @Test
    void indexOf_test () {
        LinkedList linkedList = new LinkedList();

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        assertEquals(2, linkedList.indexOf(30));
        assertEquals(-1, linkedList.indexOf(80));

    }

    @Test
    void contains_test () {
        LinkedList linkedList = new LinkedList();

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        assertTrue(linkedList.contains(30));
        assertFalse(linkedList.contains(100));

    }
}