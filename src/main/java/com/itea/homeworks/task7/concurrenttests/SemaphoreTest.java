package com.itea.homeworks.task7.concurrenttests;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {
    private static Semaphore semaphore = new Semaphore(2);

    public static void main(String[] args) {
        SemaphoreCar car1 = new SemaphoreCar();
        car1.semaphoreCar = semaphore;
        car1.start();
        SemaphoreCar car2 = new SemaphoreCar();
        car2.semaphoreCar = semaphore;
        car2.start();
        SemaphoreCar car3 = new SemaphoreCar();
        car3.semaphoreCar = semaphore;
        car3.start();
        SemaphoreCar car4 = new SemaphoreCar();
        car4.semaphoreCar = semaphore;
        car4.start();
    }

    static class SemaphoreCar extends Thread {
        Semaphore semaphoreCar;

        @Override
        public void run() {
            System.out.println("waiting for wash");
            try {
                semaphoreCar.acquire();
                System.out.println("washing the car");
                sleep(1000);
                System.out.println("wash was finished");
                semaphoreCar.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
