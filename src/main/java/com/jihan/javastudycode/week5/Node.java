package com.jihan.javastudycode.week5;

public class Node {

    int value;

    Node left;

    Node right;

    public Node(int value) {
        this(value, null, null);
    }

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

}
