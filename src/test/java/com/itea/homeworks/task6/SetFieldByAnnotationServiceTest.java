package com.itea.homeworks.task6;

import com.itea.homeworks.task6.reflection.Children;
import com.itea.homeworks.task6.reflection.ReflectionUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetFieldByAnnotationServiceTest {
    @Test
    public void shouldSetFieldCorrectly() throws IllegalAccessException {
        Children children = new Children();
        ReflectionUtils s = new ReflectionUtils();

        s.reflactionSetField(children);

        assertEquals(1001,children.ageFirstChildren);
    }
}
