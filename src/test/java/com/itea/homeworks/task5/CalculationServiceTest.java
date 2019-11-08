package com.itea.homeworks.task5;

import com.itea.homeworks.task5.utils.calculation.Service;
import org.junit.Before;
import org.junit.Test;

import static jdk.nashorn.internal.objects.Global.Infinity;
import static org.junit.Assert.assertEquals;

public class CalculationServiceTest {
    private Service service;

    @Before
    public void setUp(){
        service = new Service();
    }

    @Test
    public void shouldAddDigits() {
        double expected = 10.0;
        double delta = 0;

        double actual = service.calculate(2, 8, '+');

        assertEquals(expected, actual, delta);
    }

    @Test
    public void shouldSubtractDigits() {
        double expected = 5;
        double delta = 0;

        double actual = service.calculate(10, 5, '-');

        assertEquals(expected, actual, delta);
    }

    @Test
    public void shouldMultiplyDigits() {
        double expected = 25;
        double delta = 0;

        double actual = service.calculate(5, 5, '*');

        assertEquals(expected, actual, delta);
    }

    @Test
    public void shouldDivideDigits() {
        double expected1 = 5;
        double expected2 = Infinity;
        double delta = 0;

        double actual1 = service.calculate(25, 5, '/');
        double actual2 = service.calculate(25, 0, '/');

        assertEquals(expected1, actual1, delta);
        assertEquals(expected2, actual2, delta);
    }

    @Test
    public void shouldSquareDigits() {
        double expected1 = 1.379729661461215;
        double expected2 = Infinity;
        double expected3 = 0;
        double delta = 0;

        double actual1 = service.calculate(5, 5, '√');
        double actual2 = service.calculate(5, 0, '√');
        double actual3 = service.calculate(0, 5, '√');

        assertEquals(expected1, actual1, delta);
        assertEquals(expected2, actual2, delta);
        assertEquals(expected3, actual3, delta);
    }

    @Test
    public void shouldPowDigits() {
        double expected1 = 3125;
        double expected2 = 1;
        double expected3 = Infinity;
        double delta = 0;

        double actual1 = service.calculate(5, 5, '^');
        double actual2 = service.calculate(5, 0, '^');
        double actual3 = service.calculate(5, Infinity, '^');

        assertEquals(expected1, actual1, delta);
        assertEquals(expected2, actual2, delta);
        assertEquals(expected3, actual3, delta);
    }

    @Test
    public void shouldPowAdvancedDigits() {
        double expected = 14161;
        double delta = 0;

        double actual = service.calculate(5, 5, '~');

        assertEquals(expected, actual, delta);
    }
}
