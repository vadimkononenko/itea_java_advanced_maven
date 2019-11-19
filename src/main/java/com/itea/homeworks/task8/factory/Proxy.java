package com.itea.homeworks.task8.factory;

public class Proxy implements Working, Pattern {
    private static Working working;

    @Override
    public void work() {
        if (working == null) {
            working = new WorkingImpl();
        }
        working.work();
    }
}

class WorkingImpl implements Working {
    public WorkingImpl() {
    }

    @Override
    public void work() {
        System.out.println("Hello");
    }
}

interface Working {
    void work();
}