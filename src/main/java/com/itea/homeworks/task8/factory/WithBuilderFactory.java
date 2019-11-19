package com.itea.homeworks.task8.factory;

public class WithBuilderFactory implements PatternFactory {
    @Override
    public Pattern createPattern() {
        System.out.println("In WithBuilder");
        return new WithBuilder();
    }
}
