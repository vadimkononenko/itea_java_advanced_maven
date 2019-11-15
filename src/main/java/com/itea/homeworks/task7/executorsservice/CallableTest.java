package com.itea.homeworks.task7.executorsservice;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableTest implements Callable {

    public static void main(String[] args) throws Exception {
        CallableTest c = new CallableTest();
        System.out.println(c.call());
    }

    @Override
    public Object call() throws Exception {
        Random random = new Random();

        int i = random.nextInt(5);

        Thread.sleep(1000);
        return i;
    }
}
