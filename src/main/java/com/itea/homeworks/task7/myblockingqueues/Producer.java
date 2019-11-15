package com.itea.homeworks.task7.myblockingqueues;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
    private final BlockingQueue<Integer> queue;

    @Override
    public void run() {
        process();
    }

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    private void process() {
        for (int i = 0; i < 20; i++) {
            System.out.println("[Producer] Put : " + i);

            try {
                queue.put(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("[Producer] Queue remainingCapacity : " + queue.remainingCapacity());

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
