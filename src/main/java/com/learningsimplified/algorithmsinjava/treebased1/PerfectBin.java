package com.learningsimplified.algorithmsinjava.treebased1;

// Checking if a binary tree is a perfect binary tree in Java

/**
 * Everything is good in this except that the depth of the root node is coming as 1, however on theory it should be
 * 0, so the algorithm is not stable at one point and doesn't go according to the rules.
 */

class PerfectBin {

    static class Node {
        int key;
        Node left, right;
    }

    // Calculate the depth
    static int depth(Node node) {
        int d = 0;
        while (node != null) {
            d++;
            node = node.left;
        }
        return d;
    }

    // Check if the tree is perfect binary tree
    static boolean is_perfect(Node root, int d, int level) {

        // Check if the tree is empty
        if (root == null)
            return true;

        // If for children
        if (root.left == null && root.right == null)
            return (d == level + 1);

        if (root.left == null || root.right == null)
            return false;

        return is_perfect(root.left, d, level + 1) && is_perfect(root.right, d, level + 1);
    }

    // Wrapper function
    static boolean is_Perfect(Node root) {
        int d = depth(root);
        return is_perfect(root, d, 0);
    }

    // Create a new node
    static Node newNode(int k) {
        Node node = new Node();
        node.key = k;
        node.right = null;
        node.left = null;
        return node;
    }

    public static void main(String args[]) {
        Node root = null;
        root = newNode(1);
        root.left = newNode(2);
//        root.right = newNode(3);
//        root.left.left = newNode(4);
//        root.left.right = newNode(5);

        if (is_Perfect(root) == true)
            System.out.println("The tree is a perfect binary tree");
        else
            System.out.println("The tree is not a perfect binary tree");
    }
}
