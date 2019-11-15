package com.itea.homeworks.task7.mythread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello" + Thread.currentThread().getName());
    }
}
