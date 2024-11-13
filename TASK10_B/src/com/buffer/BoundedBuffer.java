package com.buffer;

import java.util.LinkedList;
import java.util.Queue;

public class BoundedBuffer {
	private final Queue<Integer> buffer;
    private final int capacity;

    public BoundedBuffer(int capacity) {
        this.buffer = new LinkedList<>();
        this.capacity = capacity;
    }

    public synchronized void produce(int item) throws InterruptedException {
        while (buffer.size() == capacity) {
            wait(); 
        }
        buffer.add(item); 
        System.out.println("Produced: " + item);
        notifyAll(); 
    }

    public synchronized int consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            wait(); 
        }
        int item = buffer.poll(); 
        System.out.println("Consumed: " + item);
        notifyAll(); 
        return item;
    }
}
