package com.itea.homeworks.task7.concurrenttests;

public class MyAtomicInteger {

    public static void main(String[] args) throws InterruptedException {
        ProcessingThread processingThread = new ProcessingThread();
        Thread t1 = new Thread(processingThread, "t1");
        Thread t2 = new Thread(processingThread, "t2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Processing count=" + processingThread.getCount());
    }
}

class ProcessingThread implements Runnable {
    private int count;

    @Override
    public void run() {
        for (int i = 1; i < 3; i++) {
            processSomething();
            count++;
        }
    }

    public int getCount() {
        return this.count;
    }

    private void processSomething() {
        System.out.println("smth");
    }
}
