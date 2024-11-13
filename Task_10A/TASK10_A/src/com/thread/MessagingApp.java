package com.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MessagingApp {
	public static void main(String[] args) {
        // Shared buffer with a capacity of 5 messages
        BlockingQueue<String> buffer = new LinkedBlockingQueue<>(5);

        // Creating Producer and Consumer objects
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        // Starting producer and consumer threads
        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Messaging application has finished.");
    }
}
