package com.thread;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	private BlockingQueue<String> buffer;

    public Producer(BlockingQueue<String> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                String message = "Message " + i;
                System.out.println("Produced: " + message);
                buffer.put(message); // Place the message in the buffer (blocks if full)
                Thread.sleep(500); // Simulating time delay between messages
            }
            buffer.put("END"); // Signal end of messages
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
      }
   }
}
