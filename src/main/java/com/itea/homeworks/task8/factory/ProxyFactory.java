package com.itea.homeworks.task8.factory;

public class ProxyFactory implements PatternFactory {
    @Override
    public Pattern createPattern() {
        System.out.println("In proxy");
        return new Proxy();
    }
}
