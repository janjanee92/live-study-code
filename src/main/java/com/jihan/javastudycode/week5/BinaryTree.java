package com.jihan.javastudycode.week5;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    private Node root = null;

    public Node add (int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        } else {
            return addNode(root, value);
        }
    }

    private Node addNode(Node node, int value) {
        Node newNode = null;

        int cond = comp(value, node.value);

        if (cond == 0)
            return null;
        else if (cond < 0) {
            if (node.left == null) {
                newNode = new Node(value);
                node.left = newNode;
            } else {
                addNode(node.left, value);
            }
        } else {
            if (node.right == null) {
                newNode = new Node(value);
                node.right = newNode;
            } else {
                addNode(node.right, value);
            }
        }

        return newNode;
    }

    public boolean remove(int value) {
        Node p = root;
        Node parent = null;
        boolean isLeftChild = true;

        while (true) {
            if (p == null)
                return false;
            int cond = comp(value, p.value);
            if (cond == 0)
                break;
            else {
                parent = p;
                if (cond < 0) {
                    isLeftChild = true;
                    p = p.left;
                } else {
                    isLeftChild = false;
                    p = p.right;
                }
            }
        }

        if (p.left == null) {
            if (p == root)
                root = p.right;
            else if (isLeftChild)
                parent.left = p.right;
            else
                parent.right = p.right;
        } else if (p.right == null) {
            if (p == root)
                root = p.left;
            else if (isLeftChild)
                parent.left = p.left;
            else
                parent.right = p.left;
        } else {
            parent = p;
            Node left = p.left;

            while (left.right != null) {
                parent = left;
                left = left.right;
                isLeftChild = false;
            }

            p.value = left.value;

            if (isLeftChild)
                parent.left = left.left;
            else
                parent.right = left.left;
        }

        return true;

    }

    private int comp(int x, int y) {
        return Integer.compare(x, y);
    }

    public String bfs(Node targetNode) {

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        Queue<Node> queue = new LinkedList<>();

        queue.add(targetNode);

        while (!queue.isEmpty()) {
            Node node = queue.remove();
            if (node == null) continue;
            sb.append(node.value).append(",");
            queue.add(node.left);
            queue.add(node.right);
        }

        sb.replace(sb.length() - 1, sb.length(), "]");

        return sb.toString();
    }

    public String dfs (Node targetNode) {

        StringBuffer sb = new StringBuffer();
        sb.append("[");

        inOrder(targetNode, sb);

        sb.replace(sb.length() - 1, sb.length(), "]");

        return sb.toString();
    }

    private void inOrder (Node node, StringBuffer sb) {

        if (node == null) return;

        inOrder(node.left, sb);
        sb.append(node.value).append(",");
        inOrder(node.right, sb);

    }
}
