package com.jihan.javastudycode.week5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    void add_test () {
        BinaryTree bt = new BinaryTree();

        Node root = bt.add(10);
        bt.add(8);
        bt.add(15);
        bt.add(5);
        bt.add(3);
        bt.add(9);

        assertEquals(9, root.left.right.value);
        assertEquals(15, root.right.value);
    }

    @Test
    void remove_test () {
        BinaryTree bt = new BinaryTree();

        Node root = bt.add(10);
        bt.add(8);
        bt.add(15);
        bt.add(5);
        bt.add(3);
        bt.add(9);

        bt.remove(8);

        assertEquals(5, root.left.value);

    }

    @Test
    void bfs_test () {
        BinaryTree bt = new BinaryTree();

        bt.add(10);
        bt.add(8);
        Node node = bt.add(15);
        bt.add(5);
        bt.add(3);
        bt.add(9);
        bt.add(13);
        bt.add(16);
        bt.add(12);
        bt.add(14);
        bt.add(11);

        assertEquals("[15,13,16,12,14,11]", bt.bfs(node));
    }

    @Test
    void dfs_test () {
        BinaryTree bt = new BinaryTree();

        bt.add(10);
        bt.add(8);
        Node node = bt.add(15);
        bt.add(5);
        bt.add(3);
        bt.add(9);
        bt.add(13);
        bt.add(16);
        bt.add(12);
        bt.add(14);
        bt.add(11);

        assertEquals("[11,12,13,14,15,16]", bt.dfs(node));
    }

}