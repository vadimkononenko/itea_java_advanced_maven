package com.itea.homeworks.task7.mythread;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        Thread t2 = new Thread(new MyRunnable());
        Thread t3 = new Thread(new MyRunnable());
        Thread t4 = new Thread(new MyRunnable());
        t4.setDaemon(true);
        t4.setPriority(3);
        Thread t5 = new Thread(new MyRunnable());
        t5.setDaemon(true);
        t5.setPriority(8);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
