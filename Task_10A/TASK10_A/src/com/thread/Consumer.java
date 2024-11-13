package com.thread;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	private BlockingQueue<String> buffer;

    public Consumer(BlockingQueue<String> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            String message;
            while (!(message = buffer.take()).equals("END")) { // Take messages from buffer (blocks if empty)
                System.out.println("Consumed: " + message);
                Thread.sleep(1000); // Simulating time delay in message processing
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
