package com.itea.homeworks.task7.concurrenttests;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class MyLock {
    private static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        new LockRunning().start();
        new LockRunningSecond().start();
    }

    static class LockRunning extends Thread {
        @Override
        public void run() {
            lock.lock();
            System.out.println(getName() + " start");
            try {
                sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + " stop");
            lock.unlock();
        }
    }

    static class LockRunningSecond extends Thread {
        @Override
        public void run() {
            System.out.println(getName() + " begin");
            while (true) {
                if (lock.tryLock()) {
                    System.out.println(getName() + " working");
                    break;
                } else System.out.println(getName() + " waiting");
            }
        }
    }
}
