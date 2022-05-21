package com.learningsimplified.algorithmsinjava.treebased1;


import java.sql.SQLOutput;

class NodeOfTree {
    int value;
    NodeOfTree leftNode;
    NodeOfTree rightNode;

    NodeOfTree(int key){
        this.value = key;
        leftNode = rightNode = null;
    }
}

public class TreeTraversal {
    NodeOfTree root;

    TreeTraversal(){
        root = null;
    }

    public static void main(String[] args) {
        TreeTraversal treeTraversal = new TreeTraversal();
        //Define 5 nodes of the tree
        NodeOfTree node1 = new NodeOfTree(1);
        NodeOfTree node2 = new NodeOfTree(12);
        NodeOfTree node3 = new NodeOfTree(9);
        NodeOfTree node4 = new NodeOfTree(5);
        NodeOfTree node5 = new NodeOfTree(6);
        //link them like a tree structure:
        treeTraversal.root=node1;
        treeTraversal.root.leftNode=node2;
        treeTraversal.root.rightNode=node3;
        treeTraversal.root.leftNode.leftNode=node4;
        treeTraversal.root.leftNode.rightNode=node5;

        //print the tree nodes in pre-order traversal
        System.out.println("The traversal in preorder");
        preorder(treeTraversal.root);

        System.out.println("\n The traversal in Inorder");
        inorder(treeTraversal.root);

        System.out.println("\n The traversal in Postorder");
        postorder(treeTraversal.root);

    }

    private static void preorder(NodeOfTree node) {
        if (node==null) {
            return;
        }
        System.out.print("-----> "+node.value);
        preorder(node.leftNode);
        preorder(node.rightNode);
    }

    private static void inorder(NodeOfTree node) {
        if (node==null) {
            return;
        }
        inorder(node.leftNode);
        System.out.print("-----> "+node.value);
        inorder(node.rightNode);
    }

    private static void postorder(NodeOfTree node) {
        if (node==null) {
            return;
        }
        postorder(node.leftNode);
        postorder(node.rightNode);
        System.out.print("-----> "+node.value);
    }

}





