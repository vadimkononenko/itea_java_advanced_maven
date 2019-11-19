package com.itea.homeworks.task8.factory;

public class SingletonFactory implements PatternFactory{
    @Override
    public Pattern createPattern() {
        System.out.println("In singleton");
        return new Singleton();
    }
}
