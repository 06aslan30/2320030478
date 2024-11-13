package com.buffer;

public class BoundedBufferApp {
	public static void main(String[] args) {
        BoundedBuffer buffer = new BoundedBuffer(10);
        Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread = new Thread(new Consumer(buffer));
        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Processing completed.");
    }
}
