package com.itea.homeworks.task7.waitnotify;

public class Waiter implements Runnable {
    private Message message;

    public Waiter(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();

        synchronized (message) {
            try {
                System.out.println(name + " waiting notify " + System.currentTimeMillis());
                message.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + " was notified " + System.currentTimeMillis());
            System.out.println(name + " " + message.getMessage());
        }
    }
}
