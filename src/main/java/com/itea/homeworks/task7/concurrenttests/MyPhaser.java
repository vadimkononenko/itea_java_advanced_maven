package com.itea.homeworks.task7.concurrenttests;

import java.util.concurrent.Phaser;

public class MyPhaser {
    private static Phaser phaser = new Phaser(2);

    public static void main(String[] args) {
        new PhaserRunning(phaser);
        new PhaserRunning(phaser);
    }

    static class PhaserRunning extends Thread{
        Phaser phaser;

        PhaserRunning(Phaser phaser){
            this.phaser = phaser;
            start();
        }

        @Override
        public void run() {
            for (int i = 1; i <= 3; i++) {
                System.out.println(getName() + " writing " + i);
                phaser.arriveAndAwaitAdvance();
            }
        }
    }
}
