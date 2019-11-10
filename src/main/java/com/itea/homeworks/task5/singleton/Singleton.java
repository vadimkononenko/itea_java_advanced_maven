package com.itea.homeworks.task5.singleton;

public class Singleton {
    public static Singleton instance = new Singleton();

    private Singleton() {
    }

    public Singleton getInstance() {
        if (instance == null){
            return new Singleton();
        }
        return instance;
    }
}
