package com.learningsimplified.algorithmsinjava.datastructure1;

import org.junit.jupiter.api.Test;

class QueueTest {

    Queue q = new Queue(5);

    @Test
    public void checkQueue() {
        // deQueue is not possible on empty queue
        q.deQueue();

        // enQueue 5 elements
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);

        // 6th element can't be added to because the queue is full
        q.enQueue(6);

        q.display();

        // deQueue removes element entered first i.e. 1
        q.deQueue();

        // Now we have just 4 elements
        q.display();
    }

}