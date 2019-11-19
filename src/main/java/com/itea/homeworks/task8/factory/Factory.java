package com.itea.homeworks.task8.factory;

public class Factory {
    public Singleton getSingleton() {
        return new Singleton();
    }

    public WithBuilder getWithBuilder() {
        System.out.println("In builder");
        return new WithBuilder();
    }

    public Proxy getProxy() {
        System.out.println("In proxy");
        return new Proxy();
    }
}
