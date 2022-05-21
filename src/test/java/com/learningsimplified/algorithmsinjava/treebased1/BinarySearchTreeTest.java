package com.learningsimplified.algorithmsinjava.treebased1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

    @Test
    public void TestBinarySearchTree(){
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(8);
        tree.insert(3);
        tree.insert(1);
        tree.insert(6);
        tree.insert(7);
        tree.insert(10);
        tree.insert(14);
        tree.insert(4);

        System.out.print("Inorder traversal: ");
        tree.inorder();

        System.out.println("\n\nAfter deleting 10");
        tree.deleteKeyFromBST(10);
        System.out.print("Inorder traversal: ");
        tree.inorder();
    }
}