package com.learningsimplified.algorithmsinjava.datastructure1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    public void testStack() {
        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        //stack.pop();
        System.out.println("\nAfter popping out");

        stack.printStack();
    }

}
