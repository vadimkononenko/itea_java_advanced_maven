package com.itea.homeworks.task8.factory;

public class Runner {
    public static void main(String[] args) {
        PatternFactory patternFactory = createPatternByName("singleton");
        Pattern pattern = patternFactory.createPattern();
    }

    static PatternFactory createPatternByName(String name){
        switch (name){
            case "singleton":
                return new SingletonFactory();
            case "proxy":
                return new ProxyFactory();
            case "withBuilder":
                return new WithBuilderFactory();
        }
        throw new RuntimeException(name + " is unknown");
    }
}
