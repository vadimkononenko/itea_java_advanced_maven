package com.itea.homeworks.task7;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SleepTest {
    @Test
    public void threadShouldSleep(){
        long l = System.currentTimeMillis();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertTrue(System.currentTimeMillis() - l >= 1000);
    }
}
