package com.itea.homeworks.task6;

import com.itea.homeworks.task6.changefield.Children;
import com.itea.homeworks.task6.changefield.SetFiled;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetFieldByAnnotationServiceTest {
    @Test
    public void shouldSetFieldCorrectly() throws IllegalAccessException {
        Children children = new Children();
        SetFiled s = new SetFiled();

        s.setField(children);

        assertEquals(1001,children.ageFirstChildren);
    }
}
