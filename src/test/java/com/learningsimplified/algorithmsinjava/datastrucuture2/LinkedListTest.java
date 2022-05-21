package com.learningsimplified.algorithmsinjava.datastrucuture2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {


    @Test
    public void hereIsLinkedList(){
        //Creation of the node
        LinkedList linkedList = new LinkedList();
        //call insert function:
        insertIntoLinkList(linkedList, new LinkedList.Node(1));
        insertIntoLinkList(linkedList, new LinkedList.Node(2));
        insertIntoLinkList(linkedList, new LinkedList.Node(3));
        insertIntoLinkList(linkedList, new LinkedList.Node(4));
        //delete an element from linklist
        deleteElementFromLinkList(linkedList, 4);
        //traversing a link list
        traverseALinkList(linkedList);
    }
    public void insertIntoLinkList(LinkedList linkedList, LinkedList.Node node){
        if(node!=null){
            if(linkedList.head==null){
                linkedList.head = node;
                return;
            }
            LinkedList.Node lastNode = linkedList.head;
           while(lastNode.next!=null){
               lastNode = lastNode.next;
           }
           lastNode.next = node;
        }
    }

    public void traverseALinkList(LinkedList linkedList){
        //traversing the linked list to print the values:
        LinkedList.Node traversalNode = linkedList.head;
        while (traversalNode!=null){
            System.out.println(traversalNode.value);
            traversalNode = traversalNode.next;
        }
    }

    public void deleteElementFromLinkList(LinkedList linkedList,int value) {
        LinkedList.Node traversalMarker = linkedList.head;
        if(traversalMarker.value == value){
            linkedList.head = linkedList.head.next;
            return;
        }
        while (traversalMarker != null) {
            LinkedList.Node previousNode = traversalMarker;
            LinkedList.Node currentNode = traversalMarker.next;
            LinkedList.Node nextNode = traversalMarker.next.next;
            if(currentNode.value == value){
                previousNode.next = nextNode;
                return;
            }
            traversalMarker = traversalMarker.next;
        }
    }
}