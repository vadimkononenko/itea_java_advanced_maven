package com.itea.homeworks.task6.breaksingle;

import com.itea.homeworks.task5.singleton.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingleBreaking {
    public Singleton breakSingle(Singleton instance1) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Singleton instance2 = instance1.getInstance();

        Constructor[] constructors = Singleton.class
                .getDeclaredConstructors();

        for(Constructor constructor : constructors){
            constructor.setAccessible(true);
            instance2 = (Singleton) constructor.newInstance();
            break;
        }

        return instance2;
    }
}
