package com.itea.homeworks.task6.changefield;

import com.itea.homeworks.task5.annotation.Information;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class SetFiled {
    public void setField(Children children) throws IllegalAccessException {
        for (Field field : children.getClass().getDeclaredFields()) {
            for (Annotation annotation : field.getDeclaredAnnotations()) {
                if (annotation.annotationType().equals(Information.class) && annotation instanceof Information) {
                    Information information = (Information) annotation;
                    field.setAccessible(true);
                    int i = 1001;
                    field.set(children, i);
                }
            }
        }
    }
}
