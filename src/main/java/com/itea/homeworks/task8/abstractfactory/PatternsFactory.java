package com.itea.homeworks.task8.abstractfactory;

import com.itea.homeworks.task8.factory.Pattern;
import com.itea.homeworks.task8.factory.Proxy;
import com.itea.homeworks.task8.factory.Singleton;
import com.itea.homeworks.task8.factory.WithBuilder;

public class PatternsFactory extends AbstractFactory {
    @Override
    public Pattern getPattern(String type) {
        if (type.equalsIgnoreCase("singleton")) {
            return new Singleton();
        } else if (type.equalsIgnoreCase("proxy")) {
            return new Proxy();
        } else if (type.equalsIgnoreCase("builder")) {
            return new WithBuilder();
        } else {
            throw new RuntimeException(type + " is unknown");
        }
    }
}
