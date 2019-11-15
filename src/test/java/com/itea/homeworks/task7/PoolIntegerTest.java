package com.itea.homeworks.task7;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PoolIntegerTest {
    @Test
    public void shouldBeEquals() {
        Integer a1 = 11;
        Integer a2 = 11;
        assertTrue(a1 == a2);

        Integer a11 = 127;
        Integer a22 = 127;
        assertTrue(a11 == a22);
    }

    @Test
    public void shouldBeDifferent() {
        Integer a1 = 130;
        Integer a2 = 130;

        assertFalse(a1 == a2);

        Integer a11 = new Integer(11);
        Integer a22 = new Integer(22);

        assertFalse(a11 == a22);
    }
}
