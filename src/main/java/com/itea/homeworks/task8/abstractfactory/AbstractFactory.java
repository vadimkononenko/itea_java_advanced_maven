package com.itea.homeworks.task8.abstractfactory;

import com.itea.homeworks.task8.factory.Pattern;

public abstract class AbstractFactory {
    abstract Pattern getPattern(String type);
}
