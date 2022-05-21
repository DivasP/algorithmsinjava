package com.learningsimplified.algorithmsinjava.treebased1;

/**
 * Assume root in this program like a entire tree, actually in all the programs it is like a tree.
 */

public class BinarySearchTree {
    TreeNode root;
    public BinarySearchTree() {
        this.root = null;
    }

    //these are just wrapper objects
    void insert(int key){
        root = insertIntoBST(root, key);
    }

    /**
     * essentially the root is getting returned which is nothing but the entire tree marked in recursive order.
     * @param root
     * @param value
     * @return
     */
    public TreeNode insertIntoBST(TreeNode root, int value){
        //form a node based on the value provided
        if(root==null){
            root = new TreeNode(value);
            return root;
        }

        //Traverse to the right location for inserting the node:
        if(value<root.value){
            root.leftNode = insertIntoBST(root.leftNode, value);
        } else if (value> root.value) {
            root.rightNode=insertIntoBST(root.rightNode, value);
        }
       return root;
    }

    //wrapper for deleting
    void deleteKeyFromBST(int value){
        deleteFromBST(root,value);
    }


    public TreeNode deleteFromBST(TreeNode root,int value){
      if(root==null) {
          return root;
      }
       if(value<root.value){
           root.leftNode = deleteFromBST(root.leftNode,value);
       } else if (value> root.value) {
           root.rightNode = deleteFromBST(root.rightNode, value);
       } else { // one child case where the values are swapped and the child is deleted.
           if(root.leftNode==null)
               return root.rightNode;
           else if (root.rightNode==null) {
               return root.leftNode;
           }
           //for 2 children of the node, find the inorder successor of the node, swap the values and delete the node.
           root.value = minValue(root.rightNode);
           root.rightNode = deleteFromBST(root.rightNode, value);
       }
        return root;
    }

    public int minValue(TreeNode root){
      int minValue = root.value;
      while(root.leftNode!=null){
          minValue = root.leftNode.value;
          root = root.leftNode;
      }
      return minValue;
    }


    public boolean searchBST(){
        boolean isPresent = false;
        return isPresent;
    }

    //another wrapper for inorder traversal
    public void inorder(){
        inOrderTraversal(root);
    }

    public void inOrderTraversal(TreeNode node){
        if(node!=null) {
            inOrderTraversal(node.leftNode);
            System.out.print(node.value + " ---->");
            inOrderTraversal(node.rightNode);
        }
    }



}
