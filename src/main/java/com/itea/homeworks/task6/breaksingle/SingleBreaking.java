package com.itea.homeworks.task6.breaksingle;

import com.itea.homeworks.task5.singleton.Singleton;

import java.lang.reflect.Constructor;

public class SingleBreaking {
    public Singleton breakSingle(Singleton singleton1) throws Exception {
        Singleton singleton2 = singleton1.getInstance();

        Constructor[] constructors = Singleton.class.getDeclaredConstructors();

        for(Constructor constructor : constructors){
            constructor.setAccessible(true);
            singleton2 = (Singleton) constructor.newInstance();
            break;
        }

        return singleton2;
    }
}
