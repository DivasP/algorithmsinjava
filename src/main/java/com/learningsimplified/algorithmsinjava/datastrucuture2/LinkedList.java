package com.learningsimplified.algorithmsinjava.datastrucuture2;


/**
 * this is a class case of why we need a static inner class, the fact that linked list class is of no use without
 * an inner class defined in it.
 */
class LinkedList {
    // Creating a node
    Node head;

    static class Node {
        int value;
        Node next;

        Node(int d) {
            value = d;
            next = null;
        }
    }
}
