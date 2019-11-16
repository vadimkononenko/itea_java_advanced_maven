package com.itea.homeworks.task7.myblockingqueues;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private final BlockingQueue<Integer> queue;

    @Override
    public void run() {

        try {
            while (true) {
                Integer take = queue.take();
                process(take);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }

    private void process(Integer take) {
        System.out.println("[Consumer] Take : " + take);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }
}
