package com.itea.homeworks.task7.concurrenttests;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MyCyclicBarrier {
    private static CyclicBarrier cyclicBarrier = new CyclicBarrier(2);

    public static void main(String[] args) {
        System.out.println("Started");

        new Item(cyclicBarrier, "1");
        new Item(cyclicBarrier, "2");
        new Item(cyclicBarrier, "3");
        new Item(cyclicBarrier, "4");

    }


    static class Running extends Thread {
        @Override
        public void run() {
            System.out.println("barrier");
        }
    }

    static class Item extends Thread {
        CyclicBarrier cyclicBarrier;
        String name;

        public Item(CyclicBarrier cyclicBarrier, String name) {
            this.cyclicBarrier = cyclicBarrier;
            this.name = name;
            start();
        }

        @Override
        public void run() {
            System.out.println(name);
            try {
                cyclicBarrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }
}
