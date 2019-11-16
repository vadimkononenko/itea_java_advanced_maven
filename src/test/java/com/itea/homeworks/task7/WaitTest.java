package com.itea.homeworks.task7;

import com.itea.homeworks.task7.waitnotify.Message;
import com.itea.homeworks.task7.waitnotify.Notifier;
import com.itea.homeworks.task7.waitnotify.Waiter;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class WaitTest {
    @Test
    public void threadShouldWaitWhenHeWillBeNotified(){
        Message message = new Message("hello");

        Waiter waiter1 = new Waiter(message);
        long l1 = System.currentTimeMillis();
        new Thread(waiter1,"waiter1").start();

        Notifier notifier1 = new Notifier(message);
        long l2 = System.currentTimeMillis();
        new Thread(notifier1, "notifier1").start();

        assertTrue(l1 <= l2);
    }
}
