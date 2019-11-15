package com.itea.homeworks.task7;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class JoinTest {
    @Test
    public void shouldJoinThreadCorrectly() {
        Thread t1 = new Thread(new MyJoinRunnable());
        Thread t2 = new Thread(new MyJoinRunnable());

        long l1 = System.currentTimeMillis();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long l2 = System.currentTimeMillis();
        t2.start();

        assertTrue(l1 <= l2);
    }

    class MyJoinRunnable implements Runnable {
        @Override
        public void run() {
            //System.out.println("Thread start working... " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //System.out.println("Thread finished " + Thread.currentThread().getName());
        }
    }
}
