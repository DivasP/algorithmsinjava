package com.learningsimplified.algorithmsinjava.datastructure1;


import lombok.extern.slf4j.Slf4j;

import java.sql.SQLOutput;

@Slf4j
public class Stack {

    Integer topOfStack;
    Integer capacity;
    Integer[] arr;


    public Stack(Integer noOfElements) {
        this.arr = new Integer[noOfElements];
        this.capacity = noOfElements;
        this.topOfStack = -1;
    }

    public boolean isEmpty() {
        return this.topOfStack == -1;
    }

    public boolean isFull() {
        return this.topOfStack == capacity - 1;
    }

    public void push(Integer element) {
        if (!isFull()) {
            log.info("Inserting element ", element);
            arr[++topOfStack] = element;
        } else {
            log.error("Stack is full");
            System.exit(1);
        }
    }

    public int pop() {
        if (isEmpty()) {
            log.error("Stack is empty");
            System.exit(1);
        }
        return arr[topOfStack--];
    }

    public void printStack() {
        while(!isEmpty()){
            System.out.println(pop());
        }
        }

}
