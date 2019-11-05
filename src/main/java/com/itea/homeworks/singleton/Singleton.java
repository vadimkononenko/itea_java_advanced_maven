package com.itea.homeworks.singleton;

public class Singleton {
    private Singleton instance;

    private Singleton() {
    }

    public Singleton getInstance() {
        if (instance == null){
            return new Singleton();
        }
        return instance;
    }
}
